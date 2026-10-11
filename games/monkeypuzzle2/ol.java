/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private int field_b;
    private int[] field_i;
    private int[] field_a;
    private int field_d;
    static na field_h;
    private int field_f;
    private int field_c;
    static id field_g;
    static int field_e;

    public static void a(int param0) {
        field_g = null;
        if (param0 < 108) {
          field_h = (na) null;
        }
        field_h = null;
    }

    final int c(int param0) {
        if (param0 == this.field_d) {
          this.b(param0 ^ 0);
          this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_a[fieldTemp$0];
    }

    private final void d(int param0) {
        int var2 = 0;
        int var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != 8273) {
          return;
        }
        int var6 = -1640531527;
        int var4 = -1640531527;
        int var3 = -1640531527;
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var8 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
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
          var5 = var5 + this.field_a[2 + var2Lifetime1];
          var4 = var4 + this.field_a[var2Lifetime1 + 1];
          var6 = var6 + this.field_a[var2Lifetime1 + 3];
          var9 = var9 + this.field_a[6 + var2Lifetime1];
          var7 = var7 + this.field_a[4 + var2Lifetime1];
          var10 = var10 + this.field_a[var2Lifetime1 + 7];
          var3 = var3 + this.field_a[var2Lifetime1];
          var8 = var8 + this.field_a[var2Lifetime1 + 5];
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
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_i[var2Lifetime1] = var3;
          this.field_i[1 + var2Lifetime1] = var4;
          this.field_i[var2Lifetime1 + 2] = var5;
          this.field_i[3 + var2Lifetime1] = var6;
          this.field_i[4 + var2Lifetime1] = var7;
          this.field_i[5 + var2Lifetime1] = var8;
          this.field_i[6 + var2Lifetime1] = var9;
          this.field_i[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var6 = var6 + this.field_i[3 + var2Lifetime2];
          var8 = var8 + this.field_i[var2Lifetime2 + 5];
          var7 = var7 + this.field_i[var2Lifetime2 + 4];
          var3 = var3 + this.field_i[var2Lifetime2];
          var5 = var5 + this.field_i[2 + var2Lifetime2];
          var4 = var4 + this.field_i[var2Lifetime2 + 1];
          var10 = var10 + this.field_i[var2Lifetime2 + 7];
          var9 = var9 + this.field_i[var2Lifetime2 + 6];
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
          this.field_i[var2Lifetime2] = var3;
          this.field_i[1 + var2Lifetime2] = var4;
          this.field_i[2 + var2Lifetime2] = var5;
          this.field_i[var2Lifetime2 + 3] = var6;
          this.field_i[4 + var2Lifetime2] = var7;
          this.field_i[var2Lifetime2 + 5] = var8;
          this.field_i[6 + var2Lifetime2] = var9;
          this.field_i[var2Lifetime2 + 7] = var10;
        }
        this.b(0);
        this.field_d = 256;
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        gk var16 = null;
        gk var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var16 = new gk(param0);
          var17 = var16;
          var17.field_h = -2 + param0.length;
          eg.field_c = var17.j(17277);
          ra.field_ab = new int[eg.field_c];
          j.field_d = new boolean[eg.field_c];
          cb.field_b = new byte[eg.field_c][];
          qc.field_P = new int[eg.field_c];
          da.field_c = new int[eg.field_c];
          mb.field_b = new int[eg.field_c];
          jj.field_E = new byte[eg.field_c][];
          var17.field_h = -7 + param0.length - 8 * eg.field_c;
          nj.field_d = var17.j(17277);
          qk.field_a = var17.j(17277);
          var3 = (255 & var17.a((byte) 114)) + 1;
          for (var4 = 0; var4 < eg.field_c; var4++) {
            qc.field_P[var4] = var16.j(17277);
          }
          if (param1 > -53) {
            field_e = 83;
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < eg.field_c; var4Lifetime1++) {
            mb.field_b[var4Lifetime1] = var17.j(17277);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < eg.field_c; var4Lifetime2++) {
            da.field_c[var4Lifetime2] = var17.j(17277);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < eg.field_c; var4Lifetime3++) {
            ra.field_ab[var4Lifetime3] = var17.j(17277);
          }
          var17.field_h = -(3 * (var3 - 1)) - 8 * eg.field_c + (-7 + param0.length);
          fk.field_d = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            fk.field_d[var4Lifetime4] = var17.c((byte) -121);
            if (fk.field_d[var4Lifetime4] == 0) {
              fk.field_d[var4Lifetime4] = 1;
            }
          }
          var17.field_h = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < eg.field_c; var4Lifetime5++) {
            var5 = da.field_c[var4Lifetime5];
            var6 = ra.field_ab[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            cb.field_b[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            jj.field_E[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.a((byte) 114);
            stackIn_24_0 = -1;
            stackIn_24_1 = ~(var11 & 1);
            if (stackIn_24_0 == stackIn_24_1) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.k(-77);
              }
              if (0 != (2 & var11)) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.k(-108);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_33_0 = var10;
                  if (var13 == -1) {
                    stackIn_34_1 = 0;
                  } else {
                    stackIn_34_1 = 1;
                  }
                  var10 = stackIn_33_0 | stackIn_34_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var12 + var5 * var13] = var17.k(34);
                }
              }
              if (0 != (var11 & 2)) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.k(-117);
                    var9[var5 * var13 + var12] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (-1 == var14) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            j.field_d[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("ol.B(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int fieldTemp$0 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_f = this.field_f + fieldTemp$0;
        for (var2 = param0; var2 < 256; var2++) {
          var3 = this.field_i[var2];
          if ((var2 & 2) == 0) {
            if ((1 & var2) != 0) {
              this.field_b = this.field_b ^ this.field_b >>> 6;
            } else {
              this.field_b = this.field_b ^ this.field_b << 13;
            }
          } else {
            if (0 != (var2 & 1)) {
              this.field_b = this.field_b ^ this.field_b >>> 16;
            } else {
              this.field_b = this.field_b ^ this.field_b << 2;
            }
          }
          this.field_b = this.field_b + this.field_i[var2 + 128 & 255];
          dupTemp$1 = this.field_i[ch.a(1020, var3) >> 2] + (this.field_b + this.field_f);
          var4 = dupTemp$1;
          this.field_i[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_i[ch.a(var4, 261285) >> 8 >> 2];
          this.field_f = dupTemp$2;
          this.field_a[var2] = dupTemp$2;
        }
    }

    ol(int[] param0) {
        int var2_int = 0;
        try {
          this.field_a = new int[256];
          this.field_i = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_a[var2_int] = param0[var2_int];
          }
          this.d(8273);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ol.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ad a(int param0, int param1) {
        if (param0 >= -87) {
          field_g = (id) null;
        }
        return em.a(false, param1, false, true, 1, 50);
    }

    static {
        field_h = new na();
        field_e = 256;
    }
}

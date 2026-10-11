/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    private int field_h;
    private int field_c;
    private byte[] field_i;
    int field_e;
    private byte[] field_a;
    int field_d;
    private int field_f;
    private int field_b;
    private int[] field_g;

    private final int a() {
        return this.field_e + this.field_b + this.field_c;
    }

    final void b() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var8 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var1;
        int var2;
        byte[] var3;
        byte[] var4_ref_byte__;
        int var5;
        int var6;
        int var7;
        var1 = this.d();
        var2 = this.a();
        if (this.field_d == var1 &&
          this.field_e == var2) {
          return;
        }
        var3 = new byte[var1 * var2];
        if (this.field_a == null) {
          for (var4 = 0; var4 < this.field_e; var4++) {
            var5 = var4 * this.field_d;
            var6 = (var4 + this.field_b) * var1 + this.field_h;
            for (var7 = 0; var7 < this.field_d; var7++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var3[incrementValue$0] = this.field_i[incrementValue$1];
            }
          }
        } else {
          var4_ref_byte__ = new byte[var1 * var2];
          for (var5 = 0; var5 < this.field_e; var5++) {
            var6 = var5 * this.field_d;
            var7 = (var5 + this.field_b) * var1 + this.field_h;
            for (var8 = 0; var8 < this.field_d; var8++) {
              var3[var7] = this.field_i[var6];
              incrementValue$2 = var7;
              var7++;
              incrementValue$3 = var6;
              var6++;
              var4_ref_byte__[incrementValue$2] = this.field_a[incrementValue$3];
            }
          }
          this.field_a = var4_ref_byte__;
        }
        this.field_c = 0;
        this.field_b = 0;
        this.field_f = 0;
        this.field_h = 0;
        this.field_d = var1;
        this.field_e = var2;
        this.field_i = var3;
    }

    private final int d() {
        return this.field_d + this.field_h + this.field_f;
    }

    private final static tc[] a(byte[] param0) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_1 = 0;
        fj var1;
        int var2;
        tc[] var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int var8;
        tc var8_ref_tc;
        tc var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[] var16;
        int[] var17;
        int var4Lifetime1;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        int var7_intLifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        var1 = new fj(param0);
        var1.field_n = param0.length - 2;
        var2 = var1.i(7088);
        var3 = new tc[var2];
        for (var4 = 0; var4 < var2; var4++) {
          var3[var4] = new tc();
        }
        var1.field_n = param0.length - 7 - var2 * 8;
        var4Lifetime1 = var1.i(7088);
        var5 = var1.i(7088);
        var6 = (var1.i((byte) -101) & 255) + 1;
        for (var7_int = 0; var7_int < var2; var7_int++) {
          var3[var7_int].field_h = var1.i(7088);
        }
        for (var7_intLifetime1 = 0; var7_intLifetime1 < var2; var7_intLifetime1++) {
          var3[var7_intLifetime1].field_b = var1.i(7088);
        }
        for (var7_intLifetime2 = 0; var7_intLifetime2 < var2; var7_intLifetime2++) {
          var3[var7_intLifetime2].field_d = var1.i(7088);
        }
        for (var7_intLifetime3 = 0; var7_intLifetime3 < var2; var7_intLifetime3++) {
          var3[var7_intLifetime3].field_e = var1.i(7088);
        }
        for (var7_intLifetime4 = 0; var7_intLifetime4 < var2; var7_intLifetime4++) {
          var8_ref_tc = var3[var7_intLifetime4];
          var8_ref_tc.field_f = var4Lifetime1 - var8_ref_tc.field_d - var8_ref_tc.field_h;
          var8_ref_tc.field_c = var5 - var8_ref_tc.field_e - var8_ref_tc.field_b;
        }
        var1.field_n = param0.length - 7 - var2 * 8 - (var6 - 1) * 3;
        var17 = new int[var6];
        var16 = var17;
        var7 = var16;
        for (var8 = 1; var8 < var6; var8++) {
          var7[var8] = var1.e((byte) 62);
          if (var17[var8] == 0) {
            var17[var8] = 1;
          }
        }
        for (var8Lifetime1 = 0; var8Lifetime1 < var2; var8Lifetime1++) {
          var3[var8Lifetime1].field_g = var7;
        }
        var1.field_n = 0;
        for (var8Lifetime2 = 0; var8Lifetime2 < var2; var8Lifetime2++) {
          var9 = var3[var8Lifetime2];
          var10 = var9.field_d * var9.field_e;
          var9.field_i = new byte[var10];
          var11 = var1.i((byte) -101);
          if ((var11 & 2) == 0) {
            if ((var11 & 1) == 0) {
              for (var12 = 0; var12 < var10; var12++) {
                var9.field_i[var12] = var1.f((byte) 23);
              }
            } else {
              for (var12 = 0; var12 < var9.field_d; var12++) {
                for (var13 = 0; var13 < var9.field_e; var13++) {
                  var9.field_i[var12 + var13 * var9.field_d] = var1.f((byte) 54);
                }
              }
            }
          } else {
            var12 = 0;
            var9.field_a = new byte[var10];
            if ((var11 & 1) == 0) {
              for (var13 = 0; var13 < var10; var13++) {
                var9.field_i[var13] = var1.f((byte) 93);
              }
              for (var13 = 0; var13 < var10; var13++) {
                dupTemp$1 = var1.f((byte) 59);
                var9.field_a[var13] = dupTemp$1;
                var14 = dupTemp$1;
                stackIn_53_0 = var12;
                if (var14 == -1) {
                  stackIn_54_1 = 0;
                } else {
                  stackIn_54_1 = 1;
                }
                var12 = stackIn_53_0 | stackIn_54_1;
              }
            } else {
              for (var13 = 0; var13 < var9.field_d; var13++) {
                for (var14 = 0; var14 < var9.field_e; var14++) {
                  var9.field_i[var13 + var14 * var9.field_d] = var1.f((byte) 23);
                }
              }
              for (var13 = 0; var13 < var9.field_d; var13++) {
                for (var14 = 0; var14 < var9.field_e; var14++) {
                  dupTemp$0 = var1.f((byte) 22);
                  var9.field_a[var13 + var14 * var9.field_d] = dupTemp$0;
                  var15 = dupTemp$0;
                  stackIn_67_0 = var12;
                  if (var15 == -1) {
                    stackIn_68_1 = 0;
                  } else {
                    stackIn_68_1 = 1;
                  }
                  var12 = stackIn_67_0 | stackIn_68_1;
                }
              }
            }
            if (var12 == 0) {
              var9.field_a = null;
            }
          }
        }
        return var3;
    }

    final static tc a(la param0, int param1, int param2) {
        byte[] var3 = param0.a(param1, 100, param2);
        if (var3 == null) {
          return null;
        }
        return tc.a(var3)[0];
    }

    final int[] c() {
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int var1;
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var1 = this.d();
        var2 = new int[var1 * this.a()];
        if (this.field_a != null) {
          for (var3 = 0; var3 < this.field_e; var3++) {
            var4 = var3 * this.field_d;
            var5 = this.field_h + (var3 + this.field_b) * var1;
            for (var6 = 0; var6 < this.field_d; var6++) {
              incrementValue$3 = var5;
              var5++;
              var2[incrementValue$3] = this.field_a[var4] << 24 | this.field_g[this.field_i[var4] & 255];
              var4++;
            }
          }
        } else {
          for (var3 = 0; var3 < this.field_e; var3++) {
            var4 = var3 * this.field_d;
            var5 = this.field_h + (var3 + this.field_b) * var1;
            for (var6 = 0; var6 < this.field_d; var6++) {
              incrementValue$0 = var4;
              var4++;
              var7 = this.field_g[this.field_i[incrementValue$0] & 255];
              if (var7 == 0) {
                var2[var5++] = 0;
              } else {
                incrementValue$2 = var5;
                var5++;
                var2[incrementValue$2] = -16777216 | var7;
              }
            }
          }
        }
        return var2;
    }

    final static tc a(la param0, int param1) {
        byte[] var2 = param0.b(param1, (byte) 95);
        if (var2 == null) {
          return null;
        }
        return tc.a(var2)[0];
    }
}

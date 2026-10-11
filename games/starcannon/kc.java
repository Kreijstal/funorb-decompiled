/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kc extends qd {
    static int field_Q;
    static wd field_P;
    private int field_R;
    static int field_S;
    private int field_K;
    static int field_M;
    private int field_J;
    static String field_U;
    static String[] field_N;
    private int field_I;
    private int field_L;
    static byte[][][] field_O;
    private int field_T;

    boolean i(int param0) {
        this.j(-126);
        if (param0 >= -121) {
          return false;
        }
        return super.i(-125);
    }

    void j(int param0) {
        if (param0 > -104) {
          return;
        }
        if (0 >= this.field_K) {
          return;
        }
        this.b(this.field_J, (byte) 57, this.field_L);
        this.field_K = 0;
        this.k(-108);
    }

    kc(tc param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_K = 0;
        this.field_I = 0;
    }

    public static void a(boolean param0) {
        if (param0) {
          kc.a(false);
        }
        field_P = null;
        field_U = null;
        field_N = null;
        field_O = (byte[][][]) null;
    }

    void c(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = StarCannon.field_A;
        ki.e(param0 + 6, 35 + param2, -12 + this.field_i, this.field_f - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var7 < var4) {
          if (ki.field_e <= var8 &&
            var8 < ki.field_i) {
            var9 = var7 * (-var5 + var6) / var4 + var5;
            var10 = 0;
            var11 = this.field_i;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var7 + 20) * (20 - var7) + (20 - var10) * (-var10 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  ki.field_a[param0 + (ki.field_j * var8 + var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    ki.field_a[var11 + param0 + var8 * ki.field_j] = var15;
                  } else {
                    var12Lifetime1 = 1 + var11;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            ki.b(var10 + param0, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var8Lifetime1 = 77 / ((-57 - param1) / 53);
        var7Lifetime1 = 0;
        var9Lifetime1 = param2 + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var10Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var10Lifetime1 = var10Lifetime1 | (var10Lifetime1 << 16 | var10Lifetime1 << 8);
          ki.b(param0, var9Lifetime1, 6, var10Lifetime1);
          ki.b(this.field_i + param0 - 6, var9Lifetime1, 6, var10Lifetime1);
          var9Lifetime1++;
          var7Lifetime1++;
        }
        jk.field_g.e(this.field_i + param0 - 90, 10 + param2);
        wj.a(112, ed.field_o, param0 + 5, 35 + param2, this.field_i - 10);
        wj.a(121, ti.field_e, param0, this.field_f + (param2 - 22), this.field_i);
        var5Lifetime2 = 169;
        var4Lifetime2 = this.field_f - 79;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = param2 + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          ki.b(param0, var8Lifetime2, 6, var9Lifetime2);
          ki.b(this.field_i + param0 - 6, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    final void b(int param0, int param1, byte param2, int param3) {
        if (param3 <= 0) {
          this.b(param0, (byte) 57, param1);
          return;
        }
        this.field_R = this.field_f;
        if (param2 != 120) {
          kc.a(false);
        }
        this.field_L = param1;
        this.field_I = 0;
        this.field_T = this.field_i;
        this.field_K = param3;
        this.field_J = param0;
    }

    void k(int param0) {
        if (param0 > -74) {
          this.b(46, -67, (byte) -11, -33);
        }
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -124) {
          this.g((byte) -68);
        }
        if (this.field_K > 0) {
          var2 = this.field_J;
          var3 = this.field_L;
          fieldTemp$0 = this.field_I + 1;
          this.field_I = this.field_I + 1;
          if (this.field_K <= fieldTemp$0) {
            this.field_K = 0;
            this.k(-101);
          } else {
            var4 = (2 * this.field_K - this.field_I) * this.field_I;
            var5 = this.field_K * this.field_K;
            var2 = var4 * (-this.field_T + this.field_J) / var5 + this.field_T;
            var3 = var4 * (this.field_L - this.field_R) / var5 + this.field_R;
          }
          this.b(var2, (byte) 57, var3);
        }
        return super.g((byte) -124);
    }

    static {
        field_Q = 0;
        field_N = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_U = "Waiting for music";
    }
}

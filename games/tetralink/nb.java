/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nb extends ld {
    static String field_W;
    static mh field_V;
    private int field_Q;
    private int field_P;
    private int field_S;
    private int field_O;
    private int field_R;
    private int field_U;
    static String field_T;

    void a(boolean param0) {
        if (this.field_S <= 0) {
          return;
        }
        this.a(this.field_R, (byte) 48, this.field_Q);
        this.field_S = 0;
        this.m(-7718);
        if (!param0) {
          field_V = (mh) null;
        }
    }

    void m(int param0) {
        if (param0 != -7718) {
          this.a(false, -93, 109, -69);
        }
    }

    nb(pk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_S = 0;
        this.field_P = 0;
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 > ~this.field_S) {
          var2 = this.field_R;
          var3 = this.field_Q;
          fieldTemp$0 = this.field_P + 1;
          this.field_P = this.field_P + 1;
          if (this.field_S <= fieldTemp$0) {
            this.field_S = 0;
            this.m(-7718);
          } else {
            var4 = this.field_P * (-this.field_P + 2 * this.field_S);
            var5 = this.field_S * this.field_S;
            var2 = (this.field_R - this.field_O) * var4 / var5 + this.field_O;
            var3 = var4 * (-this.field_U + this.field_Q) / var5 + this.field_U;
          }
          this.a(var2, (byte) 69, var3);
        }
        return super.l(-1);
    }

    void b(int param0, int param1, int param2) {
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
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = TetraLink.field_J;
        ra.b(param2 + 6, param0 + 35, -12 + this.field_F, this.field_u - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var7 < var4) {
          if (ra.field_i <= var8 &&
            var8 < ra.field_g) {
            var9 = var7 * (-var5 + var6) / var4 + var5;
            var10 = 0;
            var11 = this.field_F;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (-var7 + 20) + (-var10 + 20) * (20 - var10);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (-var12 + 462) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  ra.field_b[ra.field_f * var8 - (-param2 - var10)] = var13;
                }
                var10++;
              }
            }
            if (20 >= var7) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (20 - var7) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (420 > var14) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    ra.field_b[var11 + var8 * ra.field_f + param2] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            ra.g(param2 + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param0 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          ra.g(param2, var8Lifetime1, 6, var9Lifetime1);
          ra.g(-6 + (param2 + this.field_F), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        if (param1 <= 66) {
          field_W = (String) null;
        }
        ac.field_c.c(this.field_F + (param2 - 90), 10 + param0);
        gh.a(-10 + this.field_F, param2 + 5, param0 + 35, hn.field_O, -125);
        gh.a(this.field_F, param2, this.field_u + (param0 - 22), mc.field_i, -125);
        var4Lifetime2 = -79 + this.field_u;
        var5Lifetime2 = 169;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = (var6Lifetime2 - var5Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          ra.g(param2, var8Lifetime2, 6, var9Lifetime2);
          ra.g(-6 + (this.field_F + param2), var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    public static void n(int param0) {
        field_V = null;
        field_W = null;
        if (param0 != -463) {
          field_V = (mh) null;
        }
        field_T = null;
    }

    boolean h(int param0) {
        this.a(true);
        if (param0 != 652390224) {
          this.h(37);
        }
        return super.h(param0 + 0);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
          this.a(param2, (byte) 70, param3);
          return;
        }
        if (!param0) {
          this.a(false, -128, -93, -15);
        }
        this.field_R = param2;
        this.field_O = this.field_F;
        this.field_U = this.field_u;
        this.field_P = 0;
        this.field_Q = param3;
        this.field_S = param1;
    }

    final static void a(int param0, byte param1) {
        int var2 = 21 / ((-78 - param1) / 33);
        int var3 = (-640 + cf.field_n) / 2;
        int var4 = ma.field_f * ma.field_f;
        int var5 = -(param0 * param0) + var4;
        tl.field_P.a((byte) -110, 199, 90, -90 + ra.field_e - 124, var3 - var5 * 199 / var4);
        fk.field_V.a((byte) -107, 438, 0, -4 + (ra.field_e - 120), var5 * 438 / var4 + var3 + 202);
    }

    static {
        field_W = "Password is valid";
        field_T = "Back";
        field_V = new mh();
    }
}

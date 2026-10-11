/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class u extends rl {
    private int field_P;
    private int field_M;
    static oa field_O;
    static int field_V;
    static String field_Q;
    static int[] field_S;
    private int field_N;
    static int[] field_U;
    private int field_L;
    private int field_T;
    static volatile int field_R;
    private int field_W;

    void a(int param0, int param1, byte param2) {
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
        var16 = HoldTheLine.field_D;
        tc.a(6 + param0, param1 + 35, -12 + this.field_x, this.field_u - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (var8 >= tc.field_a &&
            var8 < tc.field_i) {
            var9 = var5 + var7 * (-var5 + var6) / var4;
            var10 = 0;
            var11 = this.field_x;
            if (var7 <= 20) {
              while (20 >= var10) {
                var12 = (-var7 + 20) * (20 - var7) + (20 - var10) * (-var10 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (-var12 + 462) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  tc.field_b[tc.field_j * var8 - (-param0 - var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    tc.field_b[param0 + (tc.field_j * var8 + var11)] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            tc.b(param0 + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        if (param2 != 20) {
          this.field_L = 69;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = param1 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          tc.b(param0, var8Lifetime1, 6, var9Lifetime1);
          tc.b(-6 + (param0 + this.field_x), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        di.field_t.a(param0 + this.field_x - 90, param1 + 10);
        gi.a(param1 + 35, 14191, param0 + 5, ja.field_Db, -10 + this.field_x);
        gi.a(-22 + this.field_u + param1, 14191, param0, te.field_b, this.field_x);
        var4Lifetime2 = this.field_u - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param1;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          tc.b(param0, var8Lifetime2, 6, var9Lifetime2);
          tc.b(-6 + this.field_x + param0, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    boolean a(boolean param0) {
        this.b(!param0 ? true : false);
        if (!param0) {
          this.b(-69, -36, 41, 53);
        }
        return super.a(true);
    }

    u(qj param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_L = 0;
        this.field_W = 0;
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != 39) {
          this.field_N = 59;
        }
        if (this.field_W <= 0) {
        } else {
          var2 = this.field_P;
          var3 = this.field_N;
          fieldTemp$0 = this.field_L + 1;
          this.field_L = this.field_L + 1;
          if (fieldTemp$0 < this.field_W) {
            var4 = this.field_L * (-this.field_L + this.field_W * 2);
            var5 = this.field_W * this.field_W;
            var3 = var4 * (this.field_N - this.field_M) / var5 + this.field_M;
            var2 = this.field_T + var4 * (this.field_P - this.field_T) / var5;
          } else {
            this.field_W = 0;
            this.k(-109);
          }
          this.b(537342017, var2, var3);
        }
        return super.g((byte) 39);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 <= 0) {
          this.b(537342017, param1, param3);
          return;
        }
        this.field_P = param1;
        if (param0 <= 5) {
          return;
        }
        this.field_L = 0;
        this.field_N = param3;
        this.field_W = param2;
        this.field_M = this.field_u;
        this.field_T = this.field_x;
    }

    public static void l(int param0) {
        field_S = null;
        if (param0 != 6) {
          field_V = -109;
        }
        field_U = null;
        field_O = null;
        field_Q = null;
    }

    final static String j(int param0) {
        if (ng.field_e == null) {
          return "";
        }
        if (param0 != 21) {
          field_O = (oa) null;
        }
        return ng.field_e;
    }

    void b(boolean param0) {
        if (0 >= this.field_W) {
          return;
        }
        this.b(537342017, this.field_P, this.field_N);
        this.field_W = 0;
        this.k(-108);
        if (param0) {
          this.b(true);
        }
    }

    void k(int param0) {
        if (param0 >= -100) {
          this.g((byte) -45);
        }
    }

    static {
        field_Q = "Dragster";
        field_U = new int[8192];
        field_R = 0;
        field_S = new int[8192];
    }
}

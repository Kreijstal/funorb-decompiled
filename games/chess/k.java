/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends eh {
    private int field_W;
    static String field_V;
    private int field_S;
    static String field_T;
    private int field_Y;
    private int field_Z;
    private int field_U;
    private int field_X;
    static String field_ab;

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param0) {
          this.a(param3, (byte) 101, param1);
          return;
        }
        this.field_Z = param0;
        this.field_X = param3;
        this.field_U = param1;
        if (param2 != -18807) {
          k.a(true, 101);
        }
        this.field_W = this.field_y;
        this.field_S = 0;
        this.field_Y = this.field_C;
    }

    k(fm param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_S = 0;
        this.field_Z = 0;
    }

    public static void h(byte param0) {
        field_T = null;
        field_V = null;
        field_ab = null;
        int var1 = -88 / ((80 - param0) / 36);
    }

    final static void a(boolean param0, int param1) {
        if (param1 < 19) {
          field_T = (String) null;
        }
        if (null != me.field_a) {
          me.field_a.a(false, param0);
        }
    }

    void j(int param0) {
        if (param0 != 194) {
          this.j(-9);
        }
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
        var16 = Chess.field_G;
        wb.c(6 + param2, 35 + param1, -12 + this.field_y, this.field_C - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        while (var7 < var4) {
          if (wb.field_a <= var8 &&
            var8 < wb.field_b) {
            var9 = var5 + var7 * (var6 - var5) / var4;
            var10 = 0;
            var11 = this.field_y;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var10 + 20) * (20 - var10) + (20 - var7) * (20 - var7);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 16 | var13 << 8);
                  wb.field_d[param2 + (var8 * wb.field_h + var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; 20 >= var13Lifetime1; var13Lifetime1++) {
                var14 = (20 - var7) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (462 >= var14) {
                  if (var14 >= 420) {
                    var15 = (-var14 + 462) * var9 / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    wb.field_d[var11 + var8 * wb.field_h + param2] = var15;
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
            var9 = var9 | (var9 << 8 | var9 << 16);
            wb.a(var10 + param2, var8, var11 - var10, var9);
          }
          var7++;
          var8++;
        }
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        if (param0 != -14239) {
          field_V = (String) null;
        }
        var7Lifetime1 = 0;
        var8Lifetime1 = param1 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          wb.a(param2, var8Lifetime1, 6, var9Lifetime1);
          wb.a(-6 + (param2 + this.field_y), var8Lifetime1, 6, var9Lifetime1);
          var8Lifetime1++;
          var7Lifetime1++;
        }
        vk.field_a.b(-90 + this.field_y + param2, param1 + 10);
        ml.a(35 + param1, jc.field_d, 5 + param2, -128, this.field_y - 10);
        ml.a(-22 + (this.field_C + param1), ej.field_e, param2, -127, this.field_y);
        var4Lifetime2 = this.field_C - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = param1 + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + (var6Lifetime2 - var5Lifetime2) * var7Lifetime2 / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 8 | var9Lifetime2 << 16);
          wb.a(param2, var8Lifetime2, 6, var9Lifetime2);
          wb.a(this.field_y + (param2 - 6), var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    boolean a(int param0) {
        this.i((byte) -109);
        if (param0 <= 46) {
          field_ab = (String) null;
        }
        return super.a(116);
    }

    void i(byte param0) {
        if (this.field_Z <= 0) {
          return;
        }
        if (param0 > -84) {
          return;
        }
        this.a(this.field_X, (byte) 118, this.field_U);
        this.field_Z = 0;
        this.j(194);
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 > -4) {
          this.field_W = 63;
        }
        if (this.field_Z <= 0) {
        } else {
          var2 = this.field_X;
          var3 = this.field_U;
          fieldTemp$0 = this.field_S + 1;
          this.field_S = this.field_S + 1;
          if (fieldTemp$0 >= this.field_Z) {
            this.field_Z = 0;
            this.j(194);
          } else {
            var4 = (this.field_Z * 2 - this.field_S) * this.field_S;
            var5 = this.field_Z * this.field_Z;
            var2 = this.field_W + var4 * (this.field_X - this.field_W) / var5;
            var3 = (this.field_U - this.field_Y) * var4 / var5 + this.field_Y;
          }
          this.a(var2, (byte) 108, var3);
        }
        return super.g((byte) -67);
    }

    static {
        field_T = "You have 1 unread message!";
        field_V = "Loading graphics";
        field_ab = "Find opponents";
    }
}

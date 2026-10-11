/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vg extends bb {
    static k field_U;
    static String field_T;
    private int field_X;
    private int field_Y;
    private int field_W;
    private int field_V;
    private int field_M;
    private int field_S;

    void b(boolean param0) {
        if (this.field_V <= 0) {
          return;
        }
        this.b(255, this.field_X, this.field_M);
        this.field_V = 0;
        if (param0) {
          field_T = (String) null;
        }
        this.m(100);
    }

    final static Boolean l(int param0) {
        if (param0 != -9878) {
          vg.l(-90);
        }
        Boolean var1 = sc.field_g;
        sc.field_g = null;
        return var1;
    }

    void m(int param0) {
        int var2 = 15 / ((param0 - 45) / 53);
    }

    public static void i(byte param0) {
        if (param0 != -112) {
          return;
        }
        field_T = null;
        field_U = null;
    }

    final static int a(dk[] param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        dk[] var3 = null;
        dk var5 = null;
        int var6 = 0;
        String var7 = null;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          var2_int = 2147483647;
          if (param1 != -122) {
            var7 = (String) null;
            vg.a((String) null, (String) null, (byte) -76, (String) null);
          }
          var3 = param0;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.field_l < var2_int) {
              var2_int = var5.field_l;
            }
          }
          if (2147483647 != var2_int) {
            stackIn_13_0 = var2_int;
            return stackIn_13_0;
          }
          stackIn_11_0 = 0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("vg.OB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    void b(int param0, int param1, byte param2) {
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
        var16 = EscapeVector.field_A;
        em.c(param1 + 6, param0 + 35, -12 + this.field_g, -40 + this.field_x, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var7 < var4) {
          if (em.field_k <= var8 &&
            var8 < em.field_j) {
            var9 = var7 * (var6 - var5) / var4 + var5;
            var10 = 0;
            var11 = this.field_g;
            if (20 >= var7) {
              while (var10 <= 20) {
                var12 = (20 - var7) * (20 - var7) + (20 - var10) * (-var10 + 20);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  em.field_i[em.field_l * var8 - (-param1 - var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (20 - var7) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    em.field_i[em.field_l * var8 + param1 + var11] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            em.e(param1 + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var6Lifetime1 = 169;
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var7Lifetime1 = 0;
        var8Lifetime1 = param0 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (var6Lifetime1 - var5Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          em.e(param1, var8Lifetime1, 6, var9Lifetime1);
          em.e(-6 + this.field_g + param1, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        cc.field_j.e(-90 + (param1 + this.field_g), 10 + param0);
        ee.a(5 + param1, -10 + this.field_g, true, nn.field_a, 35 + param0);
        ee.a(param1, this.field_g, true, bn.field_d, param0 + this.field_x - 22);
        var5Lifetime2 = 169;
        var4Lifetime2 = -79 + this.field_x;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param0;
        if (param2 <= 80) {
          field_U = (k) null;
        }
        while (var7Lifetime2 < var4Lifetime2) {
          var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          em.e(param1, var8Lifetime2, 6, var9Lifetime2);
          em.e(-6 + (this.field_g + param1), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -13907) {
          field_U = (k) null;
        }
        if (this.field_V <= 0) {
        } else {
          var2 = this.field_M;
          var3 = this.field_X;
          fieldTemp$0 = this.field_Y + 1;
          this.field_Y = this.field_Y + 1;
          if (fieldTemp$0 >= this.field_V) {
            this.field_V = 0;
            this.m(-105);
          } else {
            var4 = this.field_Y * (-this.field_Y + 2 * this.field_V);
            var5 = this.field_V * this.field_V;
            var2 = this.field_S + (this.field_M - this.field_S) * var4 / var5;
            var3 = this.field_W + var4 * (-this.field_W + this.field_X) / var5;
          }
          this.b(param0 ^ -13998, var3, var2);
        }
        return super.j(-13907);
    }

    vg(tb param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Y = 0;
        this.field_V = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
          this.b(255, param3, param2);
          return;
        }
        this.field_Y = 0;
        this.field_S = this.field_g;
        this.field_X = param3;
        this.field_V = param1;
        this.field_M = param2;
        if (param0) {
          this.field_V = 115;
        }
        this.field_W = this.field_x;
    }

    boolean a(byte param0) {
        this.b(false);
        int var2 = -126 % ((7 - param0) / 55);
        return super.a((byte) -61);
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var5 = EscapeVector.field_A;
        if (param2 != 111) {
          field_T = (String) null;
        }
        int var4 = param0.indexOf(param1);
        while (var4 != -1) {
          param0 = param0.substring(0, var4) + param3 + param0.substring(var4 + param1.length());
          var4 = param0.indexOf(param1, var4 + param3.length());
        }
        return param0;
    }

    static {
        field_T = "Orb coins: ";
    }
}

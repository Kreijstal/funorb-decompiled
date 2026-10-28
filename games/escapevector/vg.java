/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vg extends bb {
    static TextWidgetPainter field_U;
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
        String stackIn_17_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var2_int = 2147483647;
          if (param1 != -122) {
            String var7 = (String) null;
            vg.a((String) null, (String) null, (byte) -76, (String) null);
          }
          dk[] var3 = param0;
          for (int var4 = 0; var3.length > var4; var4++) {
            dk var5 = var3[var4];
            if (var5.field_l < var2_int) {
              var2_int = var5.field_l;
            }
          }
          if (2147483647 != var2_int) {
            int stackIn_13_0 = var2_int;
            return stackIn_13_0;
          }
          int stackIn_11_0 = 0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var2;
          StringBuilder stackIn_16_1 = new StringBuilder().append("vg.OB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    void b(int param0, int param1, byte param2) {
        int var16 = EscapeVector.obfuscationControl;
        SoftwareRasterizer.c(param1 + 6, param0 + 35, -12 + this.width, -40 + this.height, 2105376, 0);
        int var4 = 35;
        int var5 = 211;
        int var6 = 194;
        int var7 = 0;
        int var8 = param0;
        while (var7 < var4) {
          if (SoftwareRasterizer.clipTop <= var8 &&
            var8 < SoftwareRasterizer.clipBottom) {
            int var9 = var7 * (var6 - var5) / var4 + var5;
            int var10 = 0;
            int var11 = this.width;
            if (20 >= var7) {
              while (var10 <= 20) {
                int var12 = (20 - var7) * (20 - var7) + (20 - var10) * (-var10 + 20);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  int var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  SoftwareRasterizer.pixels[SoftwareRasterizer.width * var8 - (-param1 - var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              int var12Lifetime1 = var11;
              var11 -= 21;
              for (int var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                int var14 = (20 - var7) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    int var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    SoftwareRasterizer.pixels[SoftwareRasterizer.width * var8 + param1 + var11] = var15;
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
            SoftwareRasterizer.drawHorizontalLine(param1 + var10, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        int var6Lifetime1 = 169;
        int var5Lifetime1 = 194;
        int var4Lifetime1 = 22;
        int var7Lifetime1 = 0;
        int var8Lifetime1 = param0 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          int var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (var6Lifetime1 - var5Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRasterizer.drawHorizontalLine(param1, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-6 + this.width + param1, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        cc.field_j.e(-90 + (param1 + this.width), 10 + param0);
        ee.a(5 + param1, -10 + this.width, true, nn.field_a, 35 + param0);
        ee.a(param1, this.width, true, bn.field_d, param0 + this.height - 22);
        int var5Lifetime2 = 169;
        int var4Lifetime2 = -79 + this.height;
        int var6Lifetime2 = 127;
        int var7Lifetime2 = 0;
        int var8Lifetime2 = 57 + param0;
        if (param2 <= 80) {
          field_U = (TextWidgetPainter) null;
        }
        while (var7Lifetime2 < var4Lifetime2) {
          int var9Lifetime2 = var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          SoftwareRasterizer.drawHorizontalLine(param1, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRasterizer.drawHorizontalLine(-6 + (this.width + param1), var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    boolean j(int param0) {
        if (param0 != -13907) {
          field_U = (TextWidgetPainter) null;
        }
        if (this.field_V <= 0) {
        } else {
          int var2 = this.field_M;
          int var3 = this.field_X;
          int fieldTemp$0 = this.field_Y + 1;
          this.field_Y = this.field_Y + 1;
          if (fieldTemp$0 >= this.field_V) {
            this.field_V = 0;
            this.m(-105);
          } else {
            int var4 = this.field_Y * (-this.field_Y + 2 * this.field_V);
            int var5 = this.field_V * this.field_V;
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
        this.field_S = this.width;
        this.field_X = param3;
        this.field_V = param1;
        this.field_M = param2;
        if (param0) {
          this.field_V = 115;
        }
        this.field_W = this.height;
    }

    boolean a(byte param0) {
        this.b(false);
        int var2 = -126 % ((7 - param0) / 55);
        return super.a((byte) -61);
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var5 = EscapeVector.obfuscationControl;
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

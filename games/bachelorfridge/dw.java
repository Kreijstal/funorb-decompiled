/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dw extends kj {
    private int field_h;
    static int field_f;
    static byte[] field_g;

    dw(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
          this.field_h = 39;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "dw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
          return;
        }
        dw.a(30, -41, 76, 123, -15, -79);
    }

    final boolean b(int param0) {
        if (param0 < 21) {
          return true;
        }
        int fieldTemp$0 = this.field_h - 1;
        this.field_h = this.field_h - 1;
        if (fieldTemp$0 == 0) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var25 = BachelorFridge.field_y;
        try {
          var6_int = param2;
          var7 = param1;
          var8 = param3 * param3;
          var9 = param1 * param1;
          var10 = var9 << 1;
          var11 = var8 << 1;
          var12 = param1 << 1;
          var13 = (1 - var12) * var8 + var10;
          var14 = -(var11 * (var12 - 1)) + var9;
          var15 = var8 << 2;
          var16 = var9 << 2;
          var17 = var10 * (3 + (var6_int << 1));
          var18 = ((var7 << 1) - 3) * var11;
          var19 = var16 * (1 + var6_int);
          hba.a(param4, -param3 + param5, tj.field_b[param0], 7, param3 + param5);
          var20 = var15 * (-1 + var7);
          while (var7 > 0) {
            if (var13 < 0) {
              while (var13 < 0) {
                var14 = var14 + var19;
                var13 = var13 + var17;
                var19 = var19 + var16;
                var17 = var17 + var16;
                var6_int++;
              }
            }
            if (0 > var14) {
              var13 = var13 + var17;
              var14 = var14 + var19;
              var19 = var19 + var16;
              var17 = var17 + var16;
              var6_int++;
            }
            var14 = var14 - var18;
            var13 = var13 - var20;
            var7--;
            var18 = var18 - var15;
            var20 = var20 - var15;
            var21 = param0 - var7;
            var22 = param0 + var7;
            var23 = var6_int + param5;
            var24 = param5 - var6_int;
            hba.a(param4, var24, tj.field_b[var21], 7, var23);
            hba.a(param4, var24, tj.field_b[var22], param2 ^ 7, var23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "dw.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 == 0) {
          return;
        }
        dw.a(-16, -27, -89, -115, 68, -58);
    }

    final void a(int param0, boolean param1, int param2) {
        if (param1) {
          mba.field_d[(-this.field_h + 39) / 4].e(param2, -16 + param0);
          return;
        }
        this.a(-64, false, -127);
        mba.field_d[(-this.field_h + 39) / 4].e(param2, -16 + param0);
    }

    static {
    }
}

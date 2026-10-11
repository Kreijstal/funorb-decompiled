/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eu {
    static tp field_e;
    static int field_a;
    private IntrusiveNode field_c;
    private NodeDeque field_b;
    static String field_d;
    private bb field_f;
    static je field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var17Lifetime2;
        int var19Lifetime2;
        int var17Lifetime1Lifetime1;
        int var19Lifetime1Lifetime1;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = op.field_c[0][param1];
          var6 = var5_int << 1 & 105984 | (13566159 & var5_int) << 1;
          param0 += 16;
          var7 = 3;
          if (param3 < 62) {
            return;
          }
          if (!cu.field_a) {
            var7 = 2;
          }
          for (var8 = -64; var8 < 16; var8++) {
            var9 = var8;
            if (var9 >= 0) {
              var9 = 256 - (var9 * var9 << 3);
            } else {
              var9 = (var9 << 2) + 256;
            }
            var10 = var8 / 4;
            var11 = (-var10 - 16 + -var8 / 2 << 16 >> 16) + param0;
            var12 = param4 + var8 * 2;
            var13 = -var10 + (var9 / 5 + 1);
            var14 = var9 >> var7;
            SoftwareRaster.c(var11, var12, var13, var6, var14);
            SoftwareRaster.c(var11, var12 + 1, var13, var6, var14);
            var15 = var11;
            var15 = var11 + var15 >> 1 << 8;
            var16 = (var13 << 8) / 6;
            var17 = var16 / 2 + (var15 + (g.a(-1, param2 + var8 << 5) * 4 >> 8));
            var18 = var9 >> 3;
            for (var19 = 0; 3 > var19; var19++) {
              SoftwareRaster.c(var17 >> 8, var12, var16 >> 8, var5_int, var18);
              SoftwareRaster.c(var17 >> 8, 1 + var12, var16 >> 8, var5_int, var18);
              var17 = var17 + 2 * var16;
            }
            var17Lifetime2 = var16 / 4 + (var16 / 2 + var15);
            var16 = var16 / 2;
            for (var19Lifetime2 = 0; var19Lifetime2 < 3; var19Lifetime2++) {
              SoftwareRaster.c(var17Lifetime2 >> 8, var12, var16 >> 8, var5_int, var18);
              SoftwareRaster.c(var17Lifetime2 >> 8, 1 + var12, var16 >> 8, var5_int, var18);
              var17Lifetime2 = var17Lifetime2 + var16 * 4;
            }
          }
          if (!cu.field_a) {
            return;
          }
          for (var8Lifetime1 = -59; 8 > var8Lifetime1; var8Lifetime1++) {
            var9Lifetime1 = var8Lifetime1;
            if (var9Lifetime1 < 0) {
              var9Lifetime1 = 256 + (var9Lifetime1 << 2);
            } else {
              var9Lifetime1 = -(var9Lifetime1 * var9Lifetime1 << 3) + 256;
            }
            var10Lifetime1 = var8Lifetime1 / 4;
            var11Lifetime1 = param0 + (-var10Lifetime1 - 16 + -var8Lifetime1 / 2 << 16 >> 16);
            var12Lifetime1 = param4 + var8Lifetime1 * 2;
            var13Lifetime1 = 1 + var9Lifetime1 / 5 - var10Lifetime1;
            var14Lifetime1 = var9Lifetime1 >> 3;
            SoftwareRaster.c(var11Lifetime1, var12Lifetime1, var13Lifetime1, var6, var14Lifetime1);
            SoftwareRaster.c(var11Lifetime1, 1 + var12Lifetime1, var13Lifetime1, var6, var14Lifetime1);
            var15Lifetime1 = var11Lifetime1;
            var15Lifetime1 = var15Lifetime1 + var11Lifetime1 >> 1 << 8;
            var16Lifetime1 = (var13Lifetime1 << 8) / 6;
            var17Lifetime1 = var15Lifetime1 - (-(var16Lifetime1 / 2) - (4 * ae.b(var8Lifetime1 + param2 << 4, 100) >> 8));
            var18Lifetime1 = var9Lifetime1 >> 4;
            for (var19Lifetime1 = 0; 3 > var19Lifetime1; var19Lifetime1++) {
              SoftwareRaster.c(var17Lifetime1 >> 8, var12Lifetime1, var16Lifetime1 >> 8, var5_int, var18Lifetime1);
              SoftwareRaster.c(var17Lifetime1 >> 8, 1 + var12Lifetime1, var16Lifetime1 >> 8, var5_int, var18Lifetime1);
              var17Lifetime1 = var17Lifetime1 + var16Lifetime1 * 2;
            }
            var17Lifetime1Lifetime1 = var16Lifetime1 / 4 + var15Lifetime1 + var16Lifetime1 / 2;
            var16Lifetime1 = var16Lifetime1 / 2;
            for (var19Lifetime1Lifetime1 = 0; var19Lifetime1Lifetime1 < 3; var19Lifetime1Lifetime1++) {
              SoftwareRaster.c(var17Lifetime1Lifetime1 >> 8, var12Lifetime1, var16Lifetime1 >> 8, var5_int, var18Lifetime1);
              SoftwareRaster.c(var17Lifetime1Lifetime1 >> 8, 1 + var12Lifetime1, var16Lifetime1 >> 8, var5_int, var18Lifetime1);
              var17Lifetime1Lifetime1 = var17Lifetime1Lifetime1 + 4 * var16Lifetime1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "eu.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final IntrusiveNode d(byte param0) {
        if (param0 < 42) {
          Unit var3 = (Unit) null;
          this.a(57, (Unit) null);
        }
        return this.field_c;
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 != -55) {
          eu.a((byte) 5);
        }
        field_e = null;
    }

    private final boolean c(byte param0) {
        if (null != this.field_c &&
          this.field_c.next != null) {
          if (param0 == -33) {
            return false;
          }
          field_g = (je) null;
          return false;
        }
        this.field_c = null;
        return true;
    }

    final void a(int param0, Unit param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 > -90) {
            return;
          }
          if (this.field_c != param1) {
            this.field_c = (IntrusiveNode) ((Object) param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("eu.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 <= 11) {
          this.field_f = (bb) null;
        }
        this.c(10201);
        if (null != this.field_c) {
          this.field_f.a(this.field_c, true);
          this.field_c = this.field_f.b(50);
        }
        if (this.field_c == null) {
          this.field_c = this.field_f.c(50);
        }
    }

    final int b(byte param0) {
        if (param0 <= 31) {
          this.b((byte) 71);
        }
        return this.field_b.b(false);
    }

    final static void a(int param0, int param1, int param2, Unit param3) {
        try {
          cd.a(27, param2 - 16, param1, 2);
          int var4_int = 110 / ((49 - param0) / 39);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "eu.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        boolean discarded$0 = false;
        this.c(10201);
        if (null != this.field_c) {
          this.field_f.a(false, this.field_c);
          this.field_c = this.field_f.b((byte) -112);
        }
        if (param0 >= -50) {
          discarded$0 = this.c((byte) 124);
        }
        if (this.field_c == null) {
          this.field_c = this.field_f.a(50);
        }
    }

    private final void c(int param0) {
        boolean discarded$0 = false;
        if (param0 != 10201) {
          discarded$0 = this.c((byte) -44);
        }
        if (this.c((byte) -33)) {
          this.field_f = new bb(this.field_b);
        }
    }

    eu(NodeDeque param0) {
        try {
          this.field_b = param0;
          this.field_f = new bb(this.field_b);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "eu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Secret achievement";
        field_a = 20;
    }
}

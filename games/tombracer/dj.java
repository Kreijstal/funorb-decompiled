/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static int field_b;
    private la field_c;
    static String field_a;

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hr var11 = null;
        int var12 = TombRacer.field_G ? 1 : 0;
        int var7 = 131072;
        for (var8 = param4; 1 > var8; var8++) {
          var9 = param2 / 8 + (-(var7 / 2) + this.a((byte) -33, var7));
          var10 = -(var7 / 2) + (this.a((byte) -33, var7) + param5 / 8);
          var11 = this.field_c.a(param1, param0, (byte) 100, param3);
          var11.a(false, 32, 10, 16, 20 + this.a((byte) -33, 15));
          var11.a(var10, -var10 / 64, var9, -var9 / 64, 131072, -8192, (byte) -20);
          var11.a(this.a((byte) -33, 2048), this.a((byte) -33, 32) - 16, -77);
        }
    }

    final void a(pc param0, gma param1, byte param2) {
        try {
          if (param2 >= -99) {
            up var5 = (up) null;
            this.a((byte) 23, (pc) null, (up) null);
          }
          this.a(param0.field_a, (byte) -101, param0.field_j, param0.field_i, 1, qva.a((byte) -120, -param0.field_k + param0.field_f, param0.field_c - param0.field_d) - 4096, 8, 393216, param0.field_e, 4, 8);
          this.a(param0.field_a, (byte) -110, param0.field_j, param0.field_i, 1, 0, 5, 0, param0.field_e, 6, 12);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dj.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        if (param0 != -33) {
          return 65;
        }
        return uca.field_c.a(param1, 0);
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_a = null;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var16 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var17 = 0;
        int var18 = 0;
        hr var15 = null;
        int var19 = TombRacer.field_G ? 1 : 0;
        if (param1 >= -63) {
          return;
        }
        for (var16 = 0; var16 < param4; var16++) {
          var12 = param5 - 512 + this.a((byte) -33, 1024);
          var13 = hua.a((byte) 125, var12 >> 2);
          var14 = bua.a(0, var12 >> 2);
          var17 = gqa.a(var13, (byte) 24, param7);
          var18 = gqa.a(var14, (byte) 24, param7);
          var15 = this.field_c.a(param8, param0, (byte) 100, param3);
          var15.a(false, param9, param2, param10, param6);
          var15.a(var18, -var18 / 32, var17, -var17 / 32, 0, 0, (byte) -20);
          var15.a(this.a((byte) -33, 2048), this.a((byte) -33, 128) - 64, -125);
        }
    }

    final void a(byte param0, pc param1, up param2) {
        int var14 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hr var15 = null;
        int var16 = 0;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = -param1.field_d + param1.field_e;
          var5 = -param1.field_k + param1.field_a;
          if (0 == var4_int &&
            0 == var5) {
            return;
          }
          var6 = qva.a((byte) -26, var5, var4_int);
          var7 = 8;
          var8 = var7 * hua.a((byte) 112, var6 >> 2);
          var9 = bua.a(0, var6 >> 2) * var7;
          var10 = 0;
          if (ua.a(var4_int, -124) > ua.a(var5, -127)) {
            if (var8 != 0) {
              var10 = var4_int / var8;
            }
          } else {
            if (var9 != 0) {
              var10 = var5 / var9;
            }
          }
          var11 = 4;
          var12 = param1.field_d;
          if (param0 < 117) {
            return;
          }
          var13 = param1.field_k;
          for (var14 = 0; var10 > var14; var14++) {
            var15 = this.field_c.a(var12, var13, (byte) 100, param1.field_i);
            var15.a(false, 12, param1.field_j, 6, var11);
            var13 = var13 + var9;
            var12 = var12 + var8;
            var15.a(-121, var6);
            if (var12 >= 0 &&
              var13 >= 0 &&
              var12 <= this.field_c.m((byte) -86) &&
              var13 <= this.field_c.s(-127)) {
              continue;
            }
            break;
          }
          if (param1.field_h != null) {
            this.a((byte) 118, param1.field_h, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("dj.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hr var11 = null;
        int var12 = TombRacer.field_G ? 1 : 0;
        int var7 = 131072;
        for (var8 = param4; var8 < 5; var8++) {
          var9 = param3 / 8 - var7 / 2 + this.a((byte) -33, var7);
          var10 = param0 / 8 + (-(var7 / 2) + this.a((byte) -33, var7));
          var11 = this.field_c.a(param5, param1, (byte) 100, param2);
          var11.a(false, 64, 11, 16, this.a((byte) -33, 15) + 20);
          var11.a(var10, -var10 / 64, var9, -var9 / 64, 0, 0, (byte) -20);
          var11.a(this.a((byte) -33, 2048), -8 + this.a((byte) -33, 16), -112);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        hr var9 = null;
        int var10 = TombRacer.field_G ? 1 : 0;
        int var5 = 262144;
        for (var6 = 0; var6 < 4 + uca.field_c.a(4, param2 ^ 46); var6++) {
          var7 = -(var5 / 2) + this.a((byte) -33, var5);
          var8 = this.a((byte) -33, var5) - var5 / 2;
          var9 = this.field_c.a(param3, param0, (byte) 100, param1);
          var9.a(false, 16, 14, 16, 25 + uca.field_c.a(25, param2 ^ 46));
          var9.a(var8, -var8 / 64, var7, -var7 / 64, 131072 + uca.field_c.a(131072, 0), -8192, (byte) -20);
          var9.a(this.a((byte) -33, 2048), this.a((byte) -33, 32) - 16, -110);
        }
        if (param2 != 46) {
          this.field_c = (la) null;
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        hr var11 = null;
        int var12 = TombRacer.field_G ? 1 : 0;
        int var7 = 262144;
        int var8 = 0;
        if (param1 <= 78) {
          return;
        }
        while (var8 < 3) {
          var9 = -(var7 / 2) + this.a((byte) -33, var7) + param4;
          var10 = param2 - var7 / 2 + this.a((byte) -33, var7);
          var11 = this.field_c.a(param0, param5, (byte) 100, param3);
          var11.a(false, 32, 2, 16, this.a((byte) -33, 4) + 8);
          var11.b(98, var10, var9);
          var11.a(this.a((byte) -33, 2048), -64 + this.a((byte) -33, 128), -113);
          var8++;
        }
    }

    dj(la param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hr var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = TombRacer.field_G ? 1 : 0;
        int var5 = 262144;
        int var6 = 0;
        if (param3 > -2) {
          field_b = 105;
        }
        while (var6 < 8) {
          var7 = this.a((byte) -33, 8192);
          var8 = hua.a((byte) 102, var7 >> 2);
          var9 = bua.a(0, var7 >> 2);
          var10 = this.field_c.a(param1, param0, (byte) 100, param2);
          var11 = var5 + this.a((byte) -33, var5);
          var12 = gqa.a(var8, (byte) 24, var11);
          var13 = gqa.a(var9, (byte) 24, var11);
          var10.a(false, 2, 13, 16, 10);
          var10.b(70, var13, var12);
          var6++;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hr var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 29) {
          return;
        }
        int var5 = 262144;
        for (var6 = 0; var6 < 8; var6++) {
          var7 = this.a((byte) -33, 8192);
          var8 = hua.a((byte) 126, var7 >> 2);
          var9 = bua.a(0, var7 >> 2);
          var10 = this.field_c.a(param2, param3, (byte) 100, param1);
          var11 = this.a((byte) -33, var5) + var5;
          var12 = gqa.a(var8, (byte) 24, var11);
          var13 = gqa.a(var9, (byte) 24, var11);
          var10.a(false, 2, 4, 16, 10);
          var10.b(50, var13, var12);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hr var10 = null;
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        if (param0 < 47) {
          this.field_c = (la) null;
        }
        for (var6 = 0; 5 > var6; var6++) {
          var7 = -256 + (this.a((byte) -33, 512) + param4);
          var8 = hua.a((byte) 124, var7 >> 2);
          var9 = bua.a(0, var7 >> 2);
          var10 = this.field_c.a(param3, param2, (byte) 100, param1);
          var11 = 262144 + this.a((byte) -33, 262144);
          var10.a(false, 2, 4, 16, 10);
          var10.b(69, gqa.a(var9, (byte) 24, var11), gqa.a(var8, (byte) 24, var11));
        }
    }

    static {
        field_a = "Add name";
    }
}

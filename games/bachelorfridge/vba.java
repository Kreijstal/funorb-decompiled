/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vba extends bca {
    vba(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = param0.e((byte) 88);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              return;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vba.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(byte param0, lu param1) {
        if (param0 > -12) {
          return;
        }
        try {
          super.a((byte) -120, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vba.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var24 = 0;
        RuntimeException runtimeException = null;
        int var10_int = 0;
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
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_intLifetime1;
        var35 = BachelorFridge.field_y;
        try {
          if (param0 == param1 &&
            param3 == param9 &&
            param6 == param2 &&
            param5 == param8) {
            pna.a(param8, param4, 0, param6, param0, param3);
          } else {
            var10_int = param0;
            var11 = param3;
            var12 = 3 * param0;
            var13 = param3 * 3;
            var14 = 3 * param1;
            var15 = 3 * param9;
            var16 = param2 * 3;
            var17 = 3 * param5;
            var18 = param6 - var16 + var14 - param0;
            var19 = var15 + (-var17 + param8 - param3);
            var20 = -var14 + (-var14 + var16) + var12;
            var21 = var13 + var17 - var15 - var15;
            var22 = var14 - var12;
            var23 = -var13 + var15;
            for (var24 = 128; 4096 >= var24; var24 += 128) {
              var25 = var24 * var24 >> 12;
              var26 = var25 * var24 >> 12;
              var27 = var26 * var18;
              var28 = var26 * var19;
              var29 = var25 * var20;
              var30 = var25 * var21;
              var31 = var24 * var22;
              var32 = var23 * var24;
              var33 = (var29 + (var27 + var31) >> 12) + param0;
              var34 = param3 + (var28 + (var30 + var32) >> 12);
              pna.a(var34, param4, 0, var33, var10_int, var11);
              var11 = var34;
              var10_int = var33;
            }
          }
          var10_intLifetime1 = -96 / ((-59 - param7) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "vba.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    vba(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var3_int = 0;
        wia var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = BachelorFridge.field_y;
        try {
          this.field_l.a(35, param0);
          var3_int = -76 / ((param1 - 12) / 35);
          for (var4 = 0; param0.field_z > var4; var4++) {
            for (var5 = 0; param0.field_B > var5; var5++) {
              var6 = param0.field_a[var4][var5];
              if (var6.c(-87)) {
                var6.field_m = true;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vba.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        oi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new oi(param1, this);
            return (at) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (at) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}

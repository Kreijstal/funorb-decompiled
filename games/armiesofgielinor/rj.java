/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends Widget {
    private static int[] field_M;
    private int field_C;
    private int field_P;
    private int field_N;
    int field_D;
    static je field_F;
    private RgbSprite field_S;
    private int field_E;
    private int field_L;
    private RgbSprite[] field_O;
    private RgbSprite field_J;
    private int field_H;
    boolean field_R;
    private RgbSprite field_K;
    static String field_G;
    static int[] field_Q;

    private final RgbSprite b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        RgbSprite var14 = new RgbSprite(this.field_C * 2, this.height);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        CombatSandbox.a(var14, 3);
        int var5 = this.height >> 1;
        if (param1 >= -54) {
          return (RgbSprite) null;
        }
        for (var6 = 0; var6 < this.height; var6++) {
          var7 = (this.field_C * 2 - 1) * (var6 >> 1) % (this.field_C * 2);
          var8 = param2 & 16711935;
          var9 = 65280 & param2;
          var10 = var6 - var5;
          var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
          var12 = var11 < 256 ? (var8 * var11 & -16711936 | 16711680 & var11 * var9) >>> 8 : var9 | var8;
          SoftwareRaster.e(var7, var6, this.field_C, var12);
          var8Lifetime1 = 16711935 & param0;
          SoftwareRaster.e(var7 - this.field_C * 2, var6, this.field_C, var12);
          var9Lifetime1 = 65280 & param0;
          var12Lifetime1 = var11 >= 256 ? var9Lifetime1 | var8Lifetime1 : (16711680 & var9Lifetime1 * var11 | -16711936 & var11 * var8Lifetime1) >>> 8;
          SoftwareRaster.e(var7 + this.field_C, var6, this.field_C, var12Lifetime1);
          SoftwareRaster.e(-this.field_C + var7, var6, this.field_C, var12Lifetime1);
        }
        rf.b(-18862);
        return var14;
    }

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        super.setBounds(x, width, y, obfuscationGuard, height);
        this.i(3);
    }

    final void c(int param0, int param1, int param2) {
        this.field_L = param1;
        this.field_H = param0;
        this.field_P = param1 >> 1 & 8355711;
        this.field_E = 8355711 & param0 >> 1;
        this.i(3);
        if (param2 != 27178) {
          field_F = (je) null;
        }
    }

    private final void a(int param0, int param1, RgbSprite param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = param3 + this.width;
          CampaignUnitOverride.a(this.field_J.pixelWidth + param3, -this.field_J.pixelWidth + var5_int, param1 + this.height, param1, (byte) 87);
          var6 = -this.field_N + param3;
          var7 = -123 / ((param0 + 26) / 40);
          while (var6 < var5_int) {
            param2.g(var6, param1);
            var6 = var6 + param2.pixelWidth;
          }
          rf.b(-18862);
          if (SoftwareRaster.clipLeft <= param3 + this.field_J.pixelWidth) {
            CombatSandbox.a(this.field_K, 3);
            param2.g(-this.field_N, 0);
            param2.g(this.field_C * 2 - this.field_N, 0);
            this.field_S.b(0, 0);
            rf.b(-18862);
            this.field_K.g(param3, param1);
          }
          if (-this.field_J.pixelWidth + var5_int <= SoftwareRaster.clipRight) {
            CombatSandbox.a(this.field_K, 3);
            for (var8 = -this.field_J.pixelWidth + this.width + this.field_N; var8 > this.field_C * 2; var8 = var8 - this.field_C * 2) {
            }
            param2.g(-var8, 0);
            param2.g(-var8 + this.field_C * 2, 0);
            this.field_J.b(0, 0);
            rf.b(-18862);
            this.field_K.g(var5_int - this.field_J.pixelWidth, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("rj.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final static bi a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          bi var5 = null;
          dh var5_ref = null;
          bi stackIn_2_0 = null;
          bi stackIn_4_0 = null;
          dh stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("jo");
              var5 = (bi) (var4.newInstance());
              if (param2 != 1423111778) {
                stackIn_2_0 = (bi) null;
                return stackIn_2_0;
              }
              var5.a(param0, param2 ^ -1423111760, param3, param1);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new dh();
              ((bi) ((Object) var5_ref)).a(param0, -46, param3, param1);
              stackIn_6_0 = var5_ref;
              return (bi) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("rj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, (param6 & 16711422) >> 1);
    }

    public static void a(byte param0) {
        field_G = null;
        field_M = null;
        field_F = null;
        if (param0 >= -67) {
          return;
        }
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 >= -82) {
          return;
        }
        if (0 != param3) {
          return;
        }
        int var5 = this.x + param0;
        int var6 = param1 + this.y;
        this.a(-77, var6, this.field_O[0], var5);
        if (65536 > this.field_D) {
          CampaignUnitOverride.a((this.width * this.field_D >> 16) + var5, var5 + this.width, this.height + var6, var6, (byte) 74);
          this.a(-103, var6, this.field_O[1], var5);
          rf.b(-18862);
        }
    }

    final void a(int param0, int param1, int param2, Widget param3) {
        RgbSprite discarded$1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_R) {
            this.field_N = this.field_N + 1;
            if (this.field_C * 2 < this.field_N) {
              this.field_N = this.field_N - this.field_C * 2;
            }
          }
          if (param0 != 32722) {
            discarded$1 = this.b(11, 65, -18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("rj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (DamageEvent.g(125)) {
          return;
        }
        if (!ps.field_v) {
          return;
        }
        byte[] var2 = new byte[2];
        byte[] var1 = var2;
        var2[param0] = (byte)(ek.field_d << 2);
        var2[0] = (byte) 1;
        if (uc.field_a) {
          var2[1] = (byte)oe.c((int) var2[1], 2);
        }
        if (cu.field_a) {
          var2[1] = (byte)oe.c((int) var2[1], 1);
        }
        nm.a(0, 6, var2);
        ps.field_v = false;
    }

    private final RgbSprite j(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = this.height >> 1;
        RgbSprite var3 = new RgbSprite(var2, this.height);
        CombatSandbox.a(var3, param0 - 747);
        if (param0 != 750) {
          return (RgbSprite) null;
        }
        for (var4 = 0; var4 < this.height; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.height) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = 1.0 <= var6 ? 255 : (int)(var6 * 255.0);
            }
            SoftwareRaster.a(var5, var4, var8 | var8 << 8 | var8 << 16);
          }
        }
        rf.b(param0 - 19612);
        return var3;
    }

    private final void i(int param0) {
        this.field_O = new RgbSprite[]{this.b(this.field_H, -61, this.field_L), this.b(this.field_E, -120, this.field_P)};
        this.field_J = this.j(750);
        this.field_S = this.field_J.e();
        if (param0 != 3) {
          field_Q = (int[]) null;
        }
        this.field_K = new RgbSprite(this.height >> 1, this.height);
    }

    final static void d(byte param0) {
        c.field_e = null;
        qm.field_K = null;
        j.field_e = null;
        AnimationPlayer.field_j = (byte[][]) null;
        if (param0 < 96) {
          return;
        }
        MovementPresentation.field_j = null;
        CampaignMenuButton.field_g = null;
    }

    private rj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_L = param5;
        this.field_H = param6;
        this.field_P = param7;
        this.field_C = param4;
        this.field_E = param8;
        this.setBounds(param0, param2, param1, 8192, param3);
    }

    static {
        int var0 = 0;
        field_M = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
          field_M[var0] = 65536 * (var0 / 2) + (1 * var0 + 256 * (var0 / 3));
        }
        field_G = "Quality: ";
        field_Q = new int[8192];
    }
}

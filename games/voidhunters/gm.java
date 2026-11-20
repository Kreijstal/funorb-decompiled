/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends kja {
    private Sprite field_N;
    static IntrusiveDeque field_H;
    private int field_K;
    private eeb field_L;
    static byte[] field_M;
    static String field_I;
    private String field_J;

    final void a(int param0, int param1, int param2, shb param3) {
        try {
          this.field_K = this.field_K + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_M = null;
        field_I = null;
        if (param0 != -2459) {
          return;
        }
        field_H = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        String var5;
        qrb var6;
        int var13;
        Object var17;
        Object var21;
        Object var25;
        Object var30;
        int var9;
        int var10;
        int var11;
        int var12;
        Sprite var16;
        Sprite var18;
        Sprite var19;
        Sprite var20;
        Sprite var22;
        Sprite var23;
        Sprite var24;
        Sprite var26;
        Sprite var27;
        Sprite var28;
        Sprite var29;
        Sprite var31;
        Sprite var32;
        Sprite var33;
        at var34;
        at var35;
        at var36;
        at var37;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var9Lifetime3;
        int var10Lifetime3;
        int var11Lifetime4;
        int var12Lifetime4;
        qrb var6Lifetime1;
        qrb var6Lifetime2;
        qrb var6Lifetime3;
        qrb var6Lifetime1Lifetime1;
        var17 = null;
        var21 = null;
        var25 = null;
        var30 = null;
        var13 = VoidHunters.field_G;
        var6 = this.field_L.a((byte) 35);
        if (SetShieldsDirectionalArcParticleSpeedDownshift.field_p != var6 &&
          var6 != SetFighterRepairTime.field_q) {
          var5 = this.field_L.c((byte) -79);
          if (var5 == null) {
            var5 = this.field_J;
          }
        } else {
          var5 = IntrusiveNodeHashTable.field_c;
        }
        if (var5.equals(this.field_j)) {
          if (param2 < 47) {
            this.field_L = (eeb) null;
            super.b(param0, param1, 111, param3);
            var6Lifetime1 = this.field_L.a((byte) 35);
            var34 = (at) ((Object) this.field_q);
            var9 = param0 + this.field_g;
            var10 = var34.b(-3, param3, (shb) (this)) + (var34.a((shb) (this), 3).a(29565) >> 1);
            if (SetShieldsDirectionalArcParticleSpeedDownshift.field_p != var6Lifetime1 &&
              SetFighterRepairTime.field_q != var6Lifetime1) {
              if (SetArmageddonLength.field_o == var6Lifetime1) {
                var18 = ByteStorage.field_a[2];
                var18.drawAdditive(var9, var10 - (var18.height >> 1), 256);
                return;
              }
              if (var6Lifetime1 != GetShipPersistence.field_o) {
                return;
              }
              var19 = ByteStorage.field_a[1];
              var19.drawAdditive(var9, var10 - (var19.height >> 1), 256);
              return;
            }
            var20 = ByteStorage.field_a[0];
            var11 = var20.paddedWidth << 1;
            var12 = var20.paddedHeight << 1;
            if (this.field_N != null &&
              var11 <= this.field_N.width &&
              var12 <= this.field_N.height) {
              SetTorpedoEnergyUsed.a(94, this.field_N);
              SoftwareRasterizer2D.clear();
            } else {
              this.field_N = new Sprite(var11, var12);
              SetTorpedoEnergyUsed.a(99, this.field_N);
            }
            var20.drawRotatedScaledBilinear(112, 144, var20.paddedWidth << 4, var20.paddedHeight << 4, -this.field_K << 10, 4096);
            bia.a((byte) 124);
            this.field_N.drawAdditive(var9 - (var20.paddedWidth >> 1), -var20.paddedHeight + var10, 256);
            return;
          }
          super.b(param0, param1, 111, param3);
          var6Lifetime1Lifetime1 = this.field_L.a((byte) 35);
          var35 = (at) ((Object) this.field_q);
          var9Lifetime3 = param0 + this.field_g;
          var10Lifetime3 = var35.b(-3, param3, (shb) (this)) + (var35.a((shb) (this), 3).a(29565) >> 1);
          if (SetShieldsDirectionalArcParticleSpeedDownshift.field_p != var6Lifetime1Lifetime1 &&
            SetFighterRepairTime.field_q != var6Lifetime1Lifetime1) {
            if (SetArmageddonLength.field_o == var6Lifetime1Lifetime1) {
              var22 = ByteStorage.field_a[2];
              var22.drawAdditive(var9Lifetime3, var10Lifetime3 - (var22.height >> 1), 256);
              return;
            }
            if (var6Lifetime1Lifetime1 != GetShipPersistence.field_o) {
              return;
            }
            var23 = ByteStorage.field_a[1];
            var23.drawAdditive(var9Lifetime3, var10Lifetime3 - (var23.height >> 1), 256);
            return;
          }
          var24 = ByteStorage.field_a[0];
          var11Lifetime4 = var24.paddedWidth << 1;
          var12Lifetime4 = var24.paddedHeight << 1;
          if (this.field_N == null) {
            this.field_N = new Sprite(var11Lifetime4, var12Lifetime4);
            SetTorpedoEnergyUsed.a(99, this.field_N);
          } else {
            if (var11Lifetime4 > this.field_N.width) {
              this.field_N = new Sprite(var11Lifetime4, var12Lifetime4);
              SetTorpedoEnergyUsed.a(99, this.field_N);
            } else {
              if (var12Lifetime4 > this.field_N.height) {
                this.field_N = new Sprite(var11Lifetime4, var12Lifetime4);
                SetTorpedoEnergyUsed.a(99, this.field_N);
              } else {
                SetTorpedoEnergyUsed.a(94, this.field_N);
                SoftwareRasterizer2D.clear();
              }
            }
          }
          var24.drawRotatedScaledBilinear(112, 144, var24.paddedWidth << 4, var24.paddedHeight << 4, -this.field_K << 10, 4096);
          bia.a((byte) 124);
          this.field_N.drawAdditive(var9Lifetime3 - (var24.paddedWidth >> 1), -var24.paddedHeight + var10Lifetime3, 256);
          return;
        }
        this.field_j = var5;
        this.g((byte) 115);
        if (param2 >= 47) {
          super.b(param0, param1, 111, param3);
          var6Lifetime2 = this.field_L.a((byte) 35);
          var37 = (at) ((Object) this.field_q);
          var9Lifetime1 = param0 + this.field_g;
          var10Lifetime1 = var37.b(-3, param3, (shb) (this)) + (var37.a((shb) (this), 3).a(29565) >> 1);
          if (SetShieldsDirectionalArcParticleSpeedDownshift.field_p != var6Lifetime2 &&
            SetFighterRepairTime.field_q != var6Lifetime2) {
            if (SetArmageddonLength.field_o == var6Lifetime2) {
              var31 = ByteStorage.field_a[2];
              var31.drawAdditive(var9Lifetime1, var10Lifetime1 - (var31.height >> 1), 256);
              return;
            }
            if (var6Lifetime2 != GetShipPersistence.field_o) {
              return;
            }
            var32 = ByteStorage.field_a[1];
            var32.drawAdditive(var9Lifetime1, var10Lifetime1 - (var32.height >> 1), 256);
            return;
          }
          var33 = ByteStorage.field_a[0];
          var11Lifetime1 = var33.paddedWidth << 1;
          var12Lifetime1 = var33.paddedHeight << 1;
          if (this.field_N == null) {
            this.field_N = new Sprite(var11Lifetime1, var12Lifetime1);
            SetTorpedoEnergyUsed.a(99, this.field_N);
          } else {
            if (var11Lifetime1 > this.field_N.width) {
              this.field_N = new Sprite(var11Lifetime1, var12Lifetime1);
              SetTorpedoEnergyUsed.a(99, this.field_N);
            } else {
              if (var12Lifetime1 <= this.field_N.height) {
                SetTorpedoEnergyUsed.a(94, this.field_N);
                SoftwareRasterizer2D.clear();
              } else {
                this.field_N = new Sprite(var11Lifetime1, var12Lifetime1);
                SetTorpedoEnergyUsed.a(99, this.field_N);
              }
            }
          }
          var33.drawRotatedScaledBilinear(112, 144, var33.paddedWidth << 4, var33.paddedHeight << 4, -this.field_K << 10, 4096);
          bia.a((byte) 124);
          this.field_N.drawAdditive(var9Lifetime1 - (var33.paddedWidth >> 1), -var33.paddedHeight + var10Lifetime1, 256);
          return;
        }
        this.field_L = (eeb) null;
        super.b(param0, param1, 111, param3);
        var6Lifetime3 = this.field_L.a((byte) 35);
        var36 = (at) ((Object) this.field_q);
        var9Lifetime2 = param0 + this.field_g;
        var10Lifetime2 = var36.b(-3, param3, (shb) (this)) + (var36.a((shb) (this), 3).a(29565) >> 1);
        if (SetShieldsDirectionalArcParticleSpeedDownshift.field_p == var6Lifetime3) {
          var26 = ByteStorage.field_a[0];
          var11Lifetime2 = var26.paddedWidth << 1;
          var12Lifetime2 = var26.paddedHeight << 1;
          if (this.field_N != null &&
            var11Lifetime2 <= this.field_N.width &&
            var12Lifetime2 <= this.field_N.height) {
            SetTorpedoEnergyUsed.a(94, this.field_N);
            SoftwareRasterizer2D.clear();
          } else {
            this.field_N = new Sprite(var11Lifetime2, var12Lifetime2);
            SetTorpedoEnergyUsed.a(99, this.field_N);
          }
          var26.drawRotatedScaledBilinear(112, 144, var26.paddedWidth << 4, var26.paddedHeight << 4, -this.field_K << 10, 4096);
          bia.a((byte) 124);
          this.field_N.drawAdditive(var9Lifetime2 - (var26.paddedWidth >> 1), -var26.paddedHeight + var10Lifetime2, 256);
          return;
        }
        if (SetFighterRepairTime.field_q != var6Lifetime3) {
          if (SetArmageddonLength.field_o == var6Lifetime3) {
            var27 = ByteStorage.field_a[2];
            var27.drawAdditive(var9Lifetime2, var10Lifetime2 - (var27.height >> 1), 256);
            return;
          }
          if (var6Lifetime3 != GetShipPersistence.field_o) {
            return;
          }
          var28 = ByteStorage.field_a[1];
          var28.drawAdditive(var9Lifetime2, var10Lifetime2 - (var28.height >> 1), 256);
          return;
        }
        var29 = ByteStorage.field_a[0];
        var16 = var29;
        var11Lifetime3 = var29.paddedWidth << 1;
        var12Lifetime3 = var29.paddedHeight << 1;
        if (this.field_N == null) {
          this.field_N = new Sprite(var11Lifetime3, var12Lifetime3);
          SetTorpedoEnergyUsed.a(99, this.field_N);
        } else {
          if (var11Lifetime3 > this.field_N.width) {
            this.field_N = new Sprite(var11Lifetime3, var12Lifetime3);
            SetTorpedoEnergyUsed.a(99, this.field_N);
          } else {
            if (var12Lifetime3 > this.field_N.height) {
              this.field_N = new Sprite(var11Lifetime3, var12Lifetime3);
              SetTorpedoEnergyUsed.a(99, this.field_N);
            } else {
              SetTorpedoEnergyUsed.a(94, this.field_N);
              SoftwareRasterizer2D.clear();
            }
          }
        }
        var29.drawRotatedScaledBilinear(112, 144, var29.paddedWidth << 4, var29.paddedHeight << 4, -this.field_K << 10, 4096);
        bia.a((byte) 124);
        this.field_N.drawAdditive(var9Lifetime2 - (var29.paddedWidth >> 1), -var29.paddedHeight + var10Lifetime2, 256);
        return;
    }

    final boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_H = (IntrusiveDeque) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String d(byte param0) {
        if (param0 == 125) {
          return null;
        }
        this.field_J = (String) null;
        return null;
    }

    final static int toOpenGlTextureCoordinateMode(TextureCoordinateMode param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (OpenGlFramebuffer.field_c == param0) {
            stackIn_2_0 = 9216;
            return stackIn_2_0;
          }
          if (param0 == tea.field_d) {
            stackIn_9_0 = 34065;
            return stackIn_9_0;
          }
          if (param0 == GetArmageddonLength.field_p) {
            stackIn_7_0 = 34066;
            return stackIn_7_0;
          }
          if (param1 != 9216) {
            field_H = (IntrusiveDeque) null;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("gm.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    gm(eeb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, cfa.b((byte) -111));
        try {
          this.field_J = param1;
          this.field_L = param0;
          this.a(param2, param4, param5, 1, param3);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_H = new IntrusiveDeque();
        field_I = "Stingray chassis";
    }
}

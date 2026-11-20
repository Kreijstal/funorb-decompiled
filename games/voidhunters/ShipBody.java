/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ShipBody extends MovingObject implements DiffableState, CompactGameState {
    private int momentofinertia;
    private int centreofmassx;
    int[] boundingbox;
    int mass;
    int angularvelocity;
    private int angle;
    int id;
    int torque;
    private int centreofmassy;
    int forceY;
    ShipComponent chassis;
    int forceX;

    public void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ShipBody var5 = null;
        try {
          super.reportDifferences(other, -85);
          var5 = (ShipBody) (other);
          if (this.chassis != null &&
            var5.chassis != null) {
            this.chassis.reportDifferences(var5.chassis, -80);
          }
          var4 = 0;
          stackIn_7_0 = (var5.chassis != null) ? 0 : 1;
          if (null != this.chassis) {
            stackIn_10_1 = 0;
          } else {
            stackIn_10_1 = 1;
          }
          if ((stackIn_7_0 ^ stackIn_10_1) != 0 ||
            this.chassis != null &&
            this.chassis.differsFrom((byte) -118, (SerializableGameState) (var5.chassis))) {
            System.out.println("Component chassis has changed. before=" + var5.chassis + ", now=" + this.chassis);
            var4 = 1;
          }
          if (var5.angle != this.angle) {
            var4 = 1;
            System.out.println("int angle has changed. before=" + var5.angle + ", now=" + this.angle);
          }
          if (var5.angularvelocity != this.angularvelocity) {
            System.out.println("int angularvelocity has changed. before=" + var5.angularvelocity + ", now=" + this.angularvelocity);
            var4 = 1;
          }
          if (var5.centreofmassx != this.centreofmassx) {
            var4 = 1;
            System.out.println("int centreofmassx has changed. before=" + var5.centreofmassx + ", now=" + this.centreofmassx);
          }
          if (this.centreofmassy != var5.centreofmassy) {
            var4 = 1;
            System.out.println("int centreofmassy has changed. before=" + var5.centreofmassy + ", now=" + this.centreofmassy);
          }
          if (var5.mass != this.mass) {
            System.out.println("int mass has changed. before=" + var5.mass + ", now=" + this.mass);
            var4 = 1;
          }
          if (this.momentofinertia != var5.momentofinertia) {
            System.out.println("int momentofinertia has changed. before=" + var5.momentofinertia + ", now=" + this.momentofinertia);
            var4 = 1;
          }
          if (GetCountermeasuresCooldown.a(this.boundingbox, var5.boundingbox, false)) {
            var4 = 1;
            System.out.println("int[] boundingbox has changed. ");
          }
          if (obfuscationGuard > -19) {
            return;
          }
          if (this.id != var5.id) {
            var4 = 1;
            System.out.println("int id has changed. before=" + var5.id + ", now=" + this.id);
          }
          if (var4 != 0) {
            System.out.println("This instance of Body has changed, where id=" + this.id);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("anb.F(");
          if (other == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getCenterOfMassOffsetX(int param0) {
        if (param0 != 995401160) {
          this.getVelocityY(85);
        }
        int var2 = this.angle >> 8;
        return (int)((long)this.centreofmassx * (long)GetNumStars.cosAngle(var2, (byte) -62) - (long)this.centreofmassy * (long)TextureLineShape.sinAngle(var2, 124) >> 16);
    }

    final void integrateMotion(boolean param0, boolean param1, World param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          this.x = this.x + this.dx;
          if (!param1) {
            this.recalculateMassProperties((byte) 36);
          }
          this.angle = this.angle + this.angularvelocity;
          this.y = this.y + this.dy;
          this.angularvelocity = GetMissileLauncherEnergyUsed.field_q * this.angularvelocity / SetMassDriverEnergyUsed.field_o;
          this.dy = this.dy * OpenGlShaderProgram.field_a / SetMissilesCooldown.field_o;
          this.dx = OpenGlShaderProgram.field_a * this.dx / SetMissilesCooldown.field_o;
          if (param0) {
            param2.partitioningManager.saveBoundsForUpdate(this.boundingbox, (byte) -105);
          }
          this.clearBounds(16);
          var4_int = this.x - this.getCenterOfMassOffsetX(995401160);
          var5 = this.y - this.getCenterOfMassOffsetY((byte) 5);
          this.chassis.updateWorldTransforms(this instanceof Ship, var4_int, var5, this.angle >> 8, 0, this.boundingbox);
          if (param0) {
            param2.partitioningManager.updateBodyPartitions(1, this.getBodyKind(82), this.id, this.boundingbox);
            this.onStateChanged((byte) 124);
          } else {
            this.onStateChanged((byte) 124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("anb.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int getCenterOfMassOffsetY(byte param0) {
        if (param0 != 5) {
          return -127;
        }
        int var2 = this.angle >> 8;
        return (int)((long)this.centreofmassx * (long)TextureLineShape.sinAngle(var2, param0 + 105) + (long)this.centreofmassy * (long)GetNumStars.cosAngle(var2, (byte) -68) >> 16);
    }

    public void readCompactState(IsaacPacketBuffer param0, int param1) {
        try {
          super.readState(param0, false);
          if (LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            if (null == this.chassis) {
              this.chassis = new ShipComponent();
            }
            this.chassis.readCompactState(param0, 32);
          } else {
            this.chassis = null;
          }
          this.angle = uwa.a(24, param0, (byte) 20);
          this.angularvelocity = uwa.a(24, param0, (byte) 20);
          this.centreofmassx = param0.readBits(0, 32);
          this.centreofmassy = param0.readBits(param1 - 32, 32);
          this.mass = param0.readBits(0, param1);
          this.momentofinertia = param0.readBits(0, 32);
          this.boundingbox = SetVariableActionFactory.a((byte) 37, this.boundingbox, param0, 8);
          this.id = param0.readBits(0, 16);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void calculateThrusterBalanceScores(int[] param0, int[] param1, int[] param2, int param3, int[] param4, int param5, ShipComponent[] param6) {
        int var8_int = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (param3 != 3) {
            this.chassis = (ShipComponent) null;
          }
          for (var8_int = 0; param6.length > var8_int; var8_int++) {
            var9 = TextLayout.approximateVectorLength(param4[var8_int], (byte) 111, param1[var8_int]);
            stackIn_8_0 = (param2[var8_int] < 0) ? 0 : 1;
            if (param5 < 0) {
              stackIn_11_1 = 0;
            } else {
              stackIn_11_1 = 1;
            }
            var10 = stackIn_8_0 ^ stackIn_11_1;
            var11 = param2[var8_int];
            if (param2[var8_int] < 0 &&
              var10 != 0 ||
              0 < param2[var8_int] &&
              var10 == 0) {
              var11 = -var11;
            }
            param0[var8_int] = var11 / Math.max(var9, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("anb.CA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
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
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final int getY(byte param0) {
        int var2 = 124 % ((param0 - 62) / 55);
        return this.y;
    }

    final int getBoundingExtent(int param0) {
        if (param0 >= -36) {
          this.getBoundingExtent(-59);
        }
        int var2 = Math.abs(-this.x + this.boundingbox[0]);
        int var3 = Math.abs(-this.x + this.boundingbox[1]);
        int var4 = Math.abs(this.boundingbox[2] - this.y);
        int var5 = Math.abs(this.boundingbox[3] - this.y);
        return Math.max(var2, Math.max(var3, Math.max(var4, var5)));
    }

    final void applyAccumulatedForces(int param0, int param1) {
        int var3 = 0;
        if (param0 != 24) {
          World var4 = (World) null;
          this.draw((Camera2D) null, -28, (World) null, -49);
        }
        if (this.forceX != 0 ||
          this.forceY != 0) {
          this.dx = this.dx + this.forceX / param1;
          this.dy = this.dy + this.forceY / param1;
          this.onStateChanged((byte) 91);
          this.forceX = 0;
          this.forceY = 0;
        }
        if (this.torque != 0) {
          var3 = this.torque / Math.max(this.momentofinertia >> GameMenuScreen.field_e, 1);
          this.angularvelocity = this.angularvelocity + var3;
          this.onStateChanged((byte) 40);
          this.torque = 0;
        }
    }

    final void updateBounds(int param0) {
        this.clearBounds(16);
        int var2 = this.x - this.getCenterOfMassOffsetX(995401160);
        int var3 = this.y - this.getCenterOfMassOffsetY((byte) 5);
        this.chassis.updateWorldTransforms(this instanceof Ship, var2, var3, this.angle >> 8, param0, this.boundingbox);
    }

    final int getAngle(int param0) {
        if (param0 != 0) {
          this.forceY = -108;
        }
        return this.angle >> 8;
    }

    int getBodyKind(int param0) {
        if (param0 <= 42) {
          this.torque = -29;
        }
        return -1;
    }

    void recalculateMassProperties(byte param0) {
        int var2 = this.getCenterOfMassOffsetX(995401160);
        int var3 = this.getCenterOfMassOffsetY((byte) 5);
        this.chassis.updateWorldTransforms(0, true, 0, false, (byte) 88, 0, (int[]) null);
        if (param0 != 119) {
          this.chassis = (ShipComponent) null;
        }
        this.mass = this.chassis.getMass((byte) -86);
        int[] var4 = new int[]{0, 0, 0};
        this.chassis.accumulateMassMoments((byte) 114, var4);
        int var5 = Math.max(1, var4[2] >> 4);
        this.centreofmassy = var4[1] / var5;
        this.centreofmassx = var4[0] / var5;
        this.momentofinertia = this.chassis.getMomentOfInertia(-921054591, this.centreofmassx, this.centreofmassy);
        int var6 = this.getCenterOfMassOffsetX(995401160);
        int var7 = this.getCenterOfMassOffsetY((byte) 5);
        int var8 = var6 - var2;
        this.x = this.x + var8;
        int var9 = var7 - var3;
        this.y = this.y + var9;
        this.chassis.updateWorldTransforms(this.angle >> 8, false, this.y - var7, this instanceof Ship, (byte) 106, this.x - var6, (int[]) null);
        this.onStateChanged((byte) 38);
    }

    final boolean isDestroyed(int param0) {
        if (param0 >= -112) {
          return false;
        }
        return this.chassis.isDestroyed((byte) 84);
    }

    public void writeState(IsaacPacketBuffer param0, int param1) {
        IsaacPacketBuffer stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.writeState(param0, -111);
          stackIn_2_0 = (IsaacPacketBuffer) (param0);
          stackIn_2_1 = -94;
          stackIn_3_2 = (this.chassis != null);
          if (DateOfBirthInput.writeBoolean(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.chassis.writeState(param0, -115);
          }
          param0.writeBits(-632, this.angle, 24);
          param0.writeBits(-632, this.angularvelocity, 24);
          param0.writeBits(-632, this.id, 16);
          if (param1 > -109) {
            this.clearBounds(-33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("anb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void addDirectionalForce(int param0, int param1, int param2, int param3, int param4) {
        int var6 = GetNumStars.cosAngle(param1, (byte) -69) * param3 >> 8;
        int var7 = param3 * TextureLineShape.sinAngle(param1, 42) >> 8;
        this.addForceAtPoint(var7, param2, param0, (byte) -118, var6);
        if (param4 != 1948934248) {
          this.id = 82;
        }
    }

    final int aimAt(int param0, int param1, int param2) {
        int var4 = -57 / ((param0 + 56) / 55);
        return this.chassis.aimAt(param2, false, 0, param1, 21750, 0);
    }

    public void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          super.readState(param0, false);
          if (LegacyOpenGlSpecularEffect.readBoolean(param1, param0)) {
            if (null == this.chassis) {
              this.chassis = new ShipComponent();
            }
            this.chassis.readState(param0, false);
          } else {
            this.chassis = null;
          }
          this.angle = uwa.a(24, param0, (byte) 20);
          this.angularvelocity = uwa.a(24, param0, (byte) 20);
          this.id = param0.readBits(0, 16);
          this.rebuildGeometry((byte) 63);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void explode(int param0, boolean param1, World param2) {
        try {
          this.chassis.explode(param1, param2, this, (byte) -89);
          if (param0 >= -46) {
            this.forceX = 42;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.RA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void draw(Camera2D param0, int param1, World param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (!MissionAction.rectanglesIntersect(this.boundingbox, param0.worldBounds, 36)) {
            return;
          }
          this.chassis.drawTree((byte) 125, param0, this instanceof Ship, param2, param1);
          if (GetPointDefenceLaserProjectiles.a(2, 11284)) {
            var5_int = this.getCenterOfMassOffsetX(995401160);
            var6 = this.getCenterOfMassOffsetY((byte) 5);
            var7 = param0.worldToScreenX(this.x, (byte) 125);
            var8 = param0.worldToScreenY(true, this.y);
            GetPhasedEnergyBeamReload.a(var8, param0.scale * 1024.0f, -81, var7, 16711680);
            var9 = param0.worldToScreenX(-var5_int + this.x, (byte) 122);
            var10 = param0.worldToScreenY(true, -var6 + this.y);
            SetNumStars.a(1024.0f * param0.scale, (byte) 90, var10, 16777215, var9);
          }
          if (GetPointDefenceLaserProjectiles.a(param3, param3 ^ 11268)) {
            var5_intLifetime1 = param0.worldToScreenX(this.boundingbox[0], (byte) 121);
            var6Lifetime1 = param0.worldToScreenX(this.boundingbox[1], (byte) 112);
            var7Lifetime1 = param0.worldToScreenY(true, this.boundingbox[2]);
            var8Lifetime1 = param0.worldToScreenY(true, this.boundingbox[3]);
            UiToggleButtonRenderer.drawRectangle(param3 + 105, var5_intLifetime1, -var7Lifetime1 + var8Lifetime1, var7Lifetime1, 16711935, -var5_intLifetime1 + var6Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("anb.IB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setAngle(int param0, int param1) {
        this.angle = param0 << 8;
        if (param1 > -13) {
          this.centreofmassx = -127;
        }
    }

    final int getVelocityX(byte param0) {
        if (param0 > -111) {
          return 58;
        }
        return this.dx;
    }

    final void pruneDestroyedComponents(int param0, World param1) {
        try {
          int var3_int = -85 % ((26 - param0) / 35);
          this.chassis.pruneDestroyedComponents(0, param1, this);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getBoundingRadius(boolean param0) {
        if (!param0) {
          return -2;
        }
        return this.chassis.getBoundingRadius(0, this.y, -125, this.x);
    }

    final int getVelocityY(int param0) {
        if (param0 != 0) {
          this.id = -93;
        }
        return this.dy;
    }

    final boolean isMoving(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 995401160) {
          this.forceX = -99;
        }
        stackIn_8_0 = (this.dx != 0) || (this.dy != 0) || (this.angularvelocity != 0);
        return stackIn_8_0;
    }

    public void writeCompactState(IsaacPacketBuffer param0, byte param1) {
        super.writeState(param0, -113);
        if (DateOfBirthInput.writeBoolean(param0, 54, this.chassis != null ? true : false)) {
          this.chassis.writeCompactState(param0, (byte) -113);
        }
        param0.writeBits(-632, this.angle, 24);
        if (param1 > -91) {
          return;
        }
        try {
          param0.writeBits(-632, this.angularvelocity, 24);
          param0.writeBits(-632, this.centreofmassx, 32);
          param0.writeBits(-632, this.centreofmassy, 32);
          param0.writeBits(-632, this.mass, 32);
          param0.writeBits(-632, this.momentofinertia, 32);
          ChatMessage.writePackedIntArray(8, null != this.boundingbox ? this.boundingbox.length : 0, 84, param0, this.boundingbox);
          param0.writeBits(-632, this.id, 16);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void rebuildGeometry(byte param0) {
        if (this instanceof Debris) {
          this.chassis.setConnectionTransform(0, this.chassis.getDefinition((byte) -112).connectionX, param0 - 7, this.chassis.getDefinition((byte) -112).connectionY);
        } else {
          this.chassis.setConnectionTransform(0, 0, 56, 0);
        }
        int var2 = this.x;
        int var3 = this.y;
        this.recalculateMassProperties((byte) 119);
        this.x = var2;
        if (param0 != 63) {
          return;
        }
        this.y = var3;
        this.clearBounds(16);
        this.chassis.updateWorldTransforms(this instanceof Ship, this.x - this.getCenterOfMassOffsetX(995401160), this.y - this.getCenterOfMassOffsetY((byte) 5), this.angle >> 8, param0 - 63, this.boundingbox);
    }

    final void setPosition(int param0, int param1, byte param2) {
        int var4 = 5 / ((param2 + 11) / 38);
        this.x = param0;
        this.y = param1;
    }

    final boolean extendsOutsideBounds(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_10_0 = false;
        if (param2 < 8) {
          this.extendsOutsideBounds(101, -72, -14, 88, 79);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.boundingbox != null && (this.boundingbox[0] < param4 ||
          this.boundingbox[1] > param1 ||
          this.boundingbox[2] < param3 ||
          this.boundingbox[3] > param0)) {
          stackIn_10_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_10_0 = false;
        }
        return stackIn_10_0;
    }

    void onStateChanged(byte param0) {
        int var2 = -43 % ((param0 + 4) / 38);
    }

    final int getId(boolean param0) {
        if (param0) {
          World var3 = (World) null;
          this.applyControls((World) null, 115, false, 79, -113);
        }
        return this.id;
    }

    void activateSpecialOrder(int param0, int param1, World param2, int param3, int param4) {
        World var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 >= 0) {
            this.chassis.activateSpecialOrder(param1, param3, param2, (byte) -73, param4, this);
          }
          if (param0 > -36) {
            var7 = (World) null;
            this.activateSpecialOrder(-66, -62, (World) null, 87, -25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("anb.WA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void applyControls(World param0, int param1, boolean param2, int param3, int param4) {
        int var17 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ShipComponent[] var7_ref_ml__ = null;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        boolean[] var18 = null;
        int var18_int = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        ShipComponent var27_ref = null;
        Object var28 = null;
        ShipComponent var28_ref = null;
        Object var29 = null;
        ShipComponent var29_ref = null;
        Object var30 = null;
        ShipComponent var30_ref = null;
        Object var31 = null;
        ShipComponent var31_ref = null;
        Object var32 = null;
        ShipComponent var32_ref = null;
        ShipComponent var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        ShipComponent var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var49 = null;
        int[] var50 = null;
        int var7Lifetime1;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12_intLifetime1;
        int var12_intLifetime2;
        int var12_intLifetime3;
        int var16Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var25Lifetime1;
        int var8_intLifetime2;
        int var8_intLifetime3;
        int var8_intLifetime4;
        int var8_intLifetime5;
        int var8_intLifetime6;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var9Lifetime6;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var11Lifetime5;
        int var20Lifetime1Lifetime1;
        int var21Lifetime1Lifetime1;
        int var22Lifetime1Lifetime1;
        var27 = null;
        var28 = null;
        var29 = null;
        var30 = null;
        var31 = null;
        var32 = null;
        var26 = VoidHunters.field_G;
        try {
          if (SetSniperCannonProjectiles.field_o == 1) {
            stackIn_7_0 = (this.chassis.getDefinition((byte) -112).field_s) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var6_int = stackIn_7_0;
          if (param2) {
            this.rebuildGeometry((byte) -95);
          }
          if (var6_int != 0) {
            var27_ref = new ShipComponent(13);
            var27_ref.setTriggerMap((byte) -127, 1);
            var8_int = 4096;
            var9 = -(var8_int * GetNumStars.cosAngle(this.chassis.finalangle, (byte) -76)) >> 16;
            var10 = -(TextureLineShape.sinAngle(this.chassis.finalangle, 40) * var8_int) >> 16;
            var27_ref.updateWorldTransforms(false, this.chassis.finalx + var9, this.chassis.finaly + var10, this.chassis.finalangle, 0, (int[]) null);
            MissionActionFactory.field_a[0] = var27_ref;
            var28_ref = new ShipComponent(13);
            var28_ref.setTriggerMap((byte) 114, 2);
            var8_intLifetime2 = 4096;
            var9Lifetime2 = GetNumStars.cosAngle(this.chassis.finalangle, (byte) 100) * var8_intLifetime2 >> 16;
            var10Lifetime2 = var8_intLifetime2 * TextureLineShape.sinAngle(this.chassis.finalangle, 122) >> 16;
            var11 = this.chassis.finalangle + 4096;
            var28_ref.updateWorldTransforms(false, this.chassis.finalx + var9Lifetime2, this.chassis.finaly + var10Lifetime2, var11, 0, (int[]) null);
            MissionActionFactory.field_a[1] = var28_ref;
            var29_ref = new ShipComponent(13);
            var29_ref.setTriggerMap((byte) 113, 36);
            var8_intLifetime3 = 8192;
            var9Lifetime3 = GameKeyHandler.a(22433, 256 + this.chassis.finalangle);
            var10Lifetime3 = var8_intLifetime3 * GetNumStars.cosAngle(var9Lifetime3, (byte) -112) >> 16;
            var11Lifetime2 = var8_intLifetime3 * TextureLineShape.sinAngle(var9Lifetime3, 85) >> 16;
            var12_int = GameKeyHandler.a(22433, -2048 + this.chassis.finalangle);
            var29_ref.updateWorldTransforms(false, var10Lifetime3 + this.chassis.finalx, var11Lifetime2 + this.chassis.finaly, var12_int, 0, (int[]) null);
            MissionActionFactory.field_a[2] = var29_ref;
            var30_ref = new ShipComponent(13);
            var30_ref.setTriggerMap((byte) 120, 72);
            var8_intLifetime4 = 8192;
            var9Lifetime4 = GameKeyHandler.a(22433, this.chassis.finalangle - 256);
            var10Lifetime4 = var8_intLifetime4 * GetNumStars.cosAngle(var9Lifetime4, (byte) -102) >> 16;
            var11Lifetime3 = var8_intLifetime4 * TextureLineShape.sinAngle(var9Lifetime4, 87) >> 16;
            var12_intLifetime1 = GameKeyHandler.a(22433, 2048 + this.chassis.finalangle);
            var30_ref.updateWorldTransforms(false, var10Lifetime4 + this.chassis.finalx, var11Lifetime3 + this.chassis.finaly, var12_intLifetime1, 0, (int[]) null);
            MissionActionFactory.field_a[3] = var30_ref;
            var31_ref = new ShipComponent(13);
            var31_ref.setTriggerMap((byte) -23, 68);
            var8_intLifetime5 = 8192;
            var9Lifetime5 = GameKeyHandler.a(22433, this.chassis.finalangle - 3840);
            var10Lifetime5 = GetNumStars.cosAngle(var9Lifetime5, (byte) -91) * var8_intLifetime5 >> 16;
            var11Lifetime4 = var8_intLifetime5 * TextureLineShape.sinAngle(var9Lifetime5, 122) >> 16;
            var12_intLifetime2 = GameKeyHandler.a(22433, this.chassis.finalangle + 2048);
            var31_ref.updateWorldTransforms(false, var10Lifetime5 + this.chassis.finalx, var11Lifetime4 + this.chassis.finaly, var12_intLifetime2, 0, (int[]) null);
            MissionActionFactory.field_a[4] = var31_ref;
            var32_ref = new ShipComponent(13);
            var32_ref.setTriggerMap((byte) 12, 40);
            var8_intLifetime6 = 8192;
            var9Lifetime6 = GameKeyHandler.a(22433, 4096 + this.chassis.finalangle - 256);
            var10Lifetime6 = var8_intLifetime6 * GetNumStars.cosAngle(var9Lifetime6, (byte) 46) >> 16;
            var11Lifetime5 = var8_intLifetime6 * TextureLineShape.sinAngle(var9Lifetime6, 85) >> 16;
            var12_intLifetime3 = GameKeyHandler.a(22433, this.chassis.finalangle - 2048);
            var32_ref.updateWorldTransforms(false, var10Lifetime6 + this.chassis.finalx, this.chassis.finaly + var11Lifetime5, var12_intLifetime3, 0, (int[]) null);
            MissionActionFactory.field_a[5] = var32_ref;
          }
          boolean decompiledFrameRemainder0 = true;
          if (1 == BodyInZoneConditionFactory.field_b &&
            (99 & param1) != 0 &&
            (param1 & 111) == (99 & param1)) {
            var7_ref_ml__ = this.chassis.collectActiveThrusters(0, (ShipComponent[]) null, param1);
            if (var6_int != 0) {
              for (var8_intLifetime1 = 0; var8_intLifetime1 < MissionActionFactory.field_a.length; var8_intLifetime1++) {
                var7_ref_ml__ = (ShipComponent[]) (SoftwareSprite2D.a(MissionActionFactory.field_a[var8_intLifetime1], var7_ref_ml__, 0, ArchiveTextureProvider.field_d));
              }
            }
            if (var7_ref_ml__ == null) {
              param1 = param1 & -112;
              if ((var6_int != 0)) {
                for (var7 = 0; var7 < MissionActionFactory.field_a.length; var7++) {
                  MissionActionFactory.field_a[var7].applyControls(param4, 7834, this, param3, param1, param0);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var41 = new int[var7_ref_ml__.length];
              var34 = var41;
              var8 = var34;
              var9Lifetime1 = this.forceX;
              var10Lifetime1 = this.forceY;
              var11Lifetime1 = this.torque;
              var43 = new int[var7_ref_ml__.length];
              var36 = var43;
              var12 = var36;
              var44 = new int[var7_ref_ml__.length];
              var37 = var44;
              var13 = var37;
              var42 = new int[var7_ref_ml__.length];
              var35 = var42;
              var14 = var35;
              var15 = 0;
              for (var16 = 0; var7_ref_ml__.length > var16; var16++) {
                var33 = var7_ref_ml__[var16];
                var18_int = var33.triggermap;
                var19 = this.forceX;
                var20 = this.forceY;
                var21 = this.torque;
                var22 = var33.thrusterbehaviour.getThrust(var33.componentTypeId, false);
                this.addDirectionalForce(var33.finaly, var33.finalangle, var33.finalx, var22, 1948934248);
                var12[var16] = this.forceX - var19;
                var13[var16] = -var20 + this.forceY;
                var14[var16] = this.torque - var21;
                if ((param1 & var18_int) != 0) {
                  var41[var16] = 256;
                  var15 = var15 + var42[var16];
                  var12[var16] = -var43[var16];
                  var13[var16] = -var44[var16];
                  var14[var16] = -var42[var16];
                }
              }
              this.forceY = var10Lifetime1;
              this.torque = var11Lifetime1;
              this.forceX = var9Lifetime1;
              var16Lifetime1 = var15 / Math.max(this.momentofinertia >> GameMenuScreen.field_e, 1);
              if (var15 != 0 &&
                Math.abs(var16Lifetime1) > us.field_f) {
                var49 = new int[var7_ref_ml__.length];
                var18 = new boolean[var7_ref_ml__.length];
                this.calculateThrusterBalanceScores(var49, var44, var42, 3, var43, var15, var7_ref_ml__);
                var50 = new int[var7_ref_ml__.length];
                for (var20Lifetime1 = 0; var50.length > var20Lifetime1; var20Lifetime1++) {
                  var21Lifetime1 = -2147483648;
                  var22Lifetime1 = -1;
                  for (var23 = 0; var23 < var49.length; var23++) {
                    if (!var18[var23] &&
                      var49[var23] > var21Lifetime1) {
                      var22Lifetime1 = var23;
                      var21Lifetime1 = var49[var23];
                    }
                  }
                  if (var22Lifetime1 != -1) {
                    var50[var20Lifetime1] = var22Lifetime1;
                    var18[var22Lifetime1] = true;
                  }
                }
                var20Lifetime1Lifetime1 = 0;
                while (var50.length > var20Lifetime1Lifetime1) {
                  var21Lifetime1Lifetime1 = var50[var20Lifetime1Lifetime1];
                  if (0 > var49[var21Lifetime1Lifetime1]) {
                    break;
                  }
                  var22Lifetime1Lifetime1 = var42[var21Lifetime1Lifetime1];
                  var23Lifetime1 = Math.abs(var15);
                  var24 = Math.abs(var22Lifetime1Lifetime1) >> 8;
                  var25 = var23Lifetime1 / Math.max(var24, 1);
                  if (var25 < 256) {
                    if (var41[var21Lifetime1Lifetime1] > 0) {
                      var8[var21Lifetime1Lifetime1] = -var25 + 256;
                      break;
                    }
                    var41[var21Lifetime1Lifetime1] = var25;
                    break;
                  }
                  if (var41[var21Lifetime1Lifetime1] > 0) {
                    var41[var21Lifetime1Lifetime1] = 0;
                  } else {
                    var41[var21Lifetime1Lifetime1] = 256;
                  }
                  var15 = var15 + var22Lifetime1Lifetime1;
                  var25Lifetime1 = 256;
                  var20Lifetime1Lifetime1++;
                }
              }
              for (var17 = 0; var17 < var7_ref_ml__.length; var17++) {
                var40 = var7_ref_ml__[var17];
                if (var41[var17] > 0) {
                  var40.activate(this, param4, param0, param3, 55, var41[var17]);
                }
              }
              param1 = param1 & -112;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (var6_int != 0)) {
            for (var7Lifetime1 = 0; var7Lifetime1 < MissionActionFactory.field_a.length; var7Lifetime1++) {
              MissionActionFactory.field_a[var7Lifetime1].applyControls(param4, 7834, this, param3, param1, param0);
            }
          }
          this.chassis.applyControls(param4, 7834, this, param3, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("anb.FB(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int getMass(boolean param0) {
        if (param0) {
          this.angle = 99;
        }
        return this.mass;
    }

    void updateTick(World param0, boolean param1, byte param2, boolean param3) {
        int var5_int = 0;
        World var6 = null;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1) {
            stackIn_18_0 = 1;
          } else {
            if (0 == this.dx) {
              if (this.dy == 0) {
                if (0 == this.angularvelocity) {
                  if (this.boundingbox[0] == 0) {
                    if (this.boundingbox[1] == 0) {
                      if (this.boundingbox[2] == 0) {
                        stackIn_18_0 = (0 == this.boundingbox[3]) ? 1 : 0;
                      } else {
                        stackIn_18_0 = 0;
                      }
                    } else {
                      stackIn_18_0 = 0;
                    }
                  } else {
                    stackIn_18_0 = 0;
                  }
                } else {
                  stackIn_18_0 = 1;
                }
              } else {
                stackIn_18_0 = 1;
              }
            } else {
              stackIn_18_0 = 1;
            }
          }
          var5_int = stackIn_18_0;
          if (var5_int != 0) {
            this.integrateMotion(param3, true, param0);
          }
          if (this instanceof Ship) {
            this.chassis.updateBehaviors(true, (byte) -124, param0, this);
          }
          if (param2 != 67) {
            var6 = (World) null;
            this.explode(93, false, (World) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("anb.SA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int getX(boolean param0) {
        if (param0) {
          this.recalculateMassProperties((byte) 22);
        }
        return this.x;
    }

    final void traceProjectile(ProjectileTraceResult param0, Projectile param1, byte param2) {
        try {
          this.chassis.traceProjectile(param1, param0, 0);
          if (param2 < 24) {
            this.angle = 116;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.U(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean bounceWithinBounds(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        if (null == this.boundingbox) {
          return false;
        }
        if (param1 != 2147483647) {
          this.getBoundingbox((byte) 36);
        }
        var6 = 0;
        if (this.boundingbox[0] < param3) {
          var6 = 1;
          if (0 > this.dx) {
            this.dx = -this.dx;
          }
          this.x = this.x + (-this.boundingbox[0] + param3);
        }
        if (param4 < this.boundingbox[1]) {
          if (this.dx > 0) {
            this.dx = -this.dx;
          }
          var6 = 1;
          this.x = this.x + (param4 - this.boundingbox[1]);
        }
        if (this.boundingbox[2] < param0) {
          if (this.dy < 0) {
            this.dy = -this.dy;
          }
          var6 = 1;
          this.y = this.y + (-this.boundingbox[2] + param0);
        }
        if (this.boundingbox[3] > param2) {
          this.y = this.y + (param2 - this.boundingbox[3]);
          if (this.dy > 0) {
            this.dy = -this.dy;
          }
          var6 = 1;
        }
        return var6 != 0;
    }

    final int[] getBoundingbox(byte param0) {
        if (param0 >= -21) {
          return (int[]) null;
        }
        return this.boundingbox;
    }

    public boolean differsFrom(byte param0, SerializableGameState param1) {
        ShipBody var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -16 / ((param0 - 22) / 59);
          var3 = (ShipBody) (param1);
          if (!super.differsFrom((byte) 104, param1)) {
            stackIn_4_0 = (null != this.chassis) ? 0 : 1;
            if (var3.chassis != null) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (this.chassis == null ||
              !this.chassis.differsFrom((byte) 126, (SerializableGameState) (var3.chassis))) && (var3.angle == this.angle &&
              var3.angularvelocity == this.angularvelocity &&
              this.id == var3.id)) {
              stackIn_17_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_17_0 = true;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("anb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void addForceAtPoint(int param0, int param1, int param2, byte param3, int param4) {
        int var6;
        int var7;
        long var8;
        long var10;
        long var12;
        int var14;
        this.forceX = this.forceX + param4;
        this.forceY = this.forceY + param0;
        var6 = -this.x + param1;
        var7 = -this.y + param2;
        if (param3 > -112) {
          this.mass = 65;
        }
        var8 = (long)(-var7 >> ge.field_c);
        var10 = (long)(var6 >> ge.field_c);
        var12 = var8 * (long)param4 + (long)param0 * var10;
        var14 = this.torque;
        this.torque = (int)((long)this.torque + (var12 >> tua.field_a));
        if (var12 > 0L) {
          if (this.torque < var14) {
            this.torque = 2147483647;
          } else {
            if (var12 < 0L &&
              var14 < this.torque) {
              this.torque = -2147483648;
            }
          }
        } else {
          if (var12 < 0L &&
            var14 < this.torque) {
            this.torque = -2147483648;
          }
        }
        this.onStateChanged((byte) 111);
        VariableCondition.a(param1, param2, param2 - param0, -param4 + param1, (byte) -54);
    }

    final void testProjectileHit(ProjectileHit param0, Projectile param1, int param2) {
        try {
          this.chassis.testProjectileHit(param1, param0, -1);
          if (param2 != -4414) {
            World var5 = (World) null;
            this.explode(97, false, (World) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.JB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        return ": Mass=" + this.mass + ", MOI=" + this.momentofinertia + ",xpos=" + this.x + ",ypos=" + this.y + ", angle=" + this.angle + ",avel=" + this.angularvelocity;
    }

    public void copyTo(byte param0, SerializableGameState param1) {
        ShipBody var4 = null;
        try {
          super.copyTo((byte) 105, param1);
          var4 = (ShipBody) (param1);
          if (null != this.chassis) {
            if (null == var4.chassis) {
              var4.chassis = new ShipComponent();
            }
            this.chassis.copyTo((byte) 110, var4.chassis);
          } else {
            var4.chassis = null;
          }
          var4.angularvelocity = this.angularvelocity;
          var4.momentofinertia = this.momentofinertia;
          var4.angle = this.angle;
          var4.mass = this.mass;
          var4.centreofmassx = this.centreofmassx;
          var4.centreofmassy = this.centreofmassy;
          if (param0 < 54) {
            this.id = 79;
          }
          var4.boundingbox = SetTeamSelectionSpeedup.copyIntsReusingArray(var4.boundingbox, (byte) -85, this.boundingbox);
          var4.id = this.id;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "anb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ShipBody() {
        this.boundingbox = new int[4];
    }

    private final void clearBounds(int param0) {
        this.boundingbox[3] = -2147483648;
        this.boundingbox[2] = 2147483647;
        this.boundingbox[1] = -2147483648;
        if (param0 != 16) {
          this.mass = 17;
        }
        this.boundingbox[0] = 2147483647;
    }

    static {
    }
}

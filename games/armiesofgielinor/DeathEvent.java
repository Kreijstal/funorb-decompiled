/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DeathEvent extends GameEvent {
    int tileX;
    int tileY;
    private boolean field_z;
    static RgbSprite field_A;
    private boolean field_B;

    final static void a(li param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = vl.outgoingPacket;
          var5.writeCipheredOpcode(32161, param1);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, 1);
          if (null == param0.field_l) {
            var5.writeByte(param2 - 25521, 0);
          } else {
            var5.writeByte(1, param0.field_l.length);
            var5.writeBytes(param0.field_l, 0, param0.field_l.length, 86);
          }
          var5.b((byte) -39, var4);
          var5.position = var5.position - 4;
          param0.field_o = var5.readInt(param2 ^ 25523);
          var5.writeByteLengthPrefix(-var4 + var5.position, 5930);
          if (param2 == 25522) {
            return;
          }
          field_A = (RgbSprite) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hp.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 >= -80) {
          field_A = (RgbSprite) null;
        }
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        String var5 = null;
        MovementPlanner stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.applyToBattlefield(param2.battlefield, -26661);
          if (param1 > -84) {
            var5 = (String) null;
            DeathEvent.a((int[]) null, (int[]) null, (String) null, 40);
          }
          if (param2.selectedUnit != null) {
            stackIn_6_0 = param2.movementPlanner;
            stackIn_7_1 = (null == param2.field_oc);
            ((MovementPlanner) (Object) stackIn_6_0).prepareForUnit(stackIn_7_1, 32, param2.field_q, param2.selectedUnit, param2.movementPlanner.field_y, param2.movementPlanner.spellId);
          }
          stackIn_9_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("hp.A(");
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
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var3 = 0;
        String var4 = null;
        String var4Lifetime1;
        String var4Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        if (!verbose) {
          var3 = 58 / ((53 - obfuscationGuard) / 51);
          var4 = "EventDeath: pos: (" + this.tileX + "," + this.tileY + ")";
          return var4;
        }
        System.out.println("Death event debug");
        System.out.println("Unit at " + this.tileX + "," + this.tileY);
        if (this.field_z) {
          System.out.println("Bones devoured");
          var3Lifetime1 = 58 / ((53 - obfuscationGuard) / 51);
          var4Lifetime1 = "EventDeath: pos: (" + this.tileX + "," + this.tileY + ")";
          return var4Lifetime1;
        }
        var3Lifetime2 = 58 / ((53 - obfuscationGuard) / 51);
        var4Lifetime2 = "EventDeath: pos: (" + this.tileX + "," + this.tileY + ")";
        return var4Lifetime2;
    }

    DeathEvent(int param0, int param1) {
        this.field_B = false;
        this.field_z = false;
        this.tileX = param0;
        this.tileY = param1;
        this.eventKind = 10;
        this.unit = null;
    }

    final static RgbSprite a(int[] param0, int[] param1, String param2, int param3) {
        RuntimeException var4 = null;
        RgbSprite stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          no.field_P.pixelHeight = SoftwareRaster.height;
          no.field_P.pixels = SoftwareRaster.pixels;
          no.field_P.pixelWidth = SoftwareRaster.width;
          ku.field_J.b();
          SoftwareRaster.b();
          MatchSetupPanel.a(-1, -1, param1, -1, false, param0, -1, false, 0, false, 0, param2);
          no.field_P.b();
          if (param3 == 17813) {
            stackIn_4_0 = ew.a((byte) 107, ku.field_J);
            return (RgbSprite) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (RgbSprite) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("hp.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    DeathEvent(Unit param0) {
        this.field_B = false;
        try {
          this.tileY = param0.tileY;
          this.tileX = param0.tileX;
          this.unit = param0;
          this.eventKind = 10;
          this.field_z = false;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        RuntimeException var3 = null;
        Unit stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B) {
            return;
          }
          this.field_B = true;
          if (null == this.unit) {
            this.unit = battlefield.getUnitAt(this.tileY, true, this.tileX);
          }
          if (this.unit != null) {
            stackIn_8_0 = this.unit;
            stackIn_9_1 = !(this.field_z);
            ((Unit) (Object) stackIn_8_0).a(stackIn_9_1, (byte) 105);
          }
          hf.a(battlefield, (byte) 9, true);
          if (obfuscationGuard == -26661) {
            return;
          }
          field_A = (RgbSprite) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hp.G(");
          if (battlefield == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    DeathEvent(Unit param0, boolean param1) {
        this.field_B = false;
        try {
          this.field_z = param1 ? true : false;
          this.eventKind = 10;
          this.tileY = param0.tileY;
          this.tileX = param0.tileX;
          this.unit = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}

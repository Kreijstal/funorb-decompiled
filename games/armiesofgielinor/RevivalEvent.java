/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RevivalEvent extends GameEvent {
    static String field_B;
    private int destinationX;
    static int field_D;
    private int destinationY;
    static long field_z;

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true) | this.a(this.destinationY, 15, param2, param0, this.destinationX);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("rt.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int a(CharSequence param0, int param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param0.length();
          for (var5 = param1; var4 > var5; var5++) {
            if (param2 == param0.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("rt.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var3 = -56 / ((obfuscationGuard - 53) / 51);
        return null;
    }

    public static void e(byte param0) {
        if (param0 < 78) {
          RevivalEvent.getCampaignPacketWord3(98);
          field_B = null;
          return;
        }
        field_B = null;
    }

    final static boolean a(boolean param0, Class param1) {
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_12_0 = (Integer.TYPE == param1) || (Short.TYPE == param1) || (param1 == Long.TYPE) || (Byte.TYPE == param1) || (Float.TYPE == param1) || (param1 == Double.TYPE);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("rt.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 <= 102) {
            RevivalEvent.e((byte) -63);
          }
          if (MoveEvent.tutorialStageItems[0] == null) {
            return;
          }
          if (2 >= MoveEvent.tutorialStageItems[0].length) {
            return;
          }
          var1_int = 0;
          while (true) {
            if (MoveEvent.tutorialStageItems[0].length <= var1_int) {
              return;
            }
            if (MoveEvent.tutorialStageItems[0][var1_int] != 25) {
              var1_int++;
              continue;
            }
            break;
          }
          MoveEvent.tutorialStageItems[0][var1_int] = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "rt.S(" + param0 + ')');
        }
    }

    final static int getCampaignPacketWord3(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return 45;
        }
        return wr.campaignPacketWord3;
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        try {
          battlefield.tiles[battlefield.mapWidth * this.unit.tileY + this.unit.tileX].occupant = null;
          battlefield.tiles[battlefield.mapWidth * this.destinationY + this.destinationX].occupant = this.unit;
          battlefield.tiles[battlefield.mapWidth * this.destinationY + this.destinationX].field_l = false;
          this.unit.tileY = this.destinationY;
          this.unit.poisoned = false;
          if (obfuscationGuard != -26661) {
            RevivalEvent.e((byte) -101);
          }
          this.unit.strength = this.unit.maximumStrength;
          this.unit.tileX = this.destinationX;
          this.unit.accessoryType = 0;
          this.unit.refreshTileEffects((byte) -96);
          this.unit.removedFromActivePlay = false;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rt.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_B = (String) null;
          }
          ep.a(!param0, param1, param2);
          if (null == ad.field_I) {
            return;
          }
          op.a(-110, ad.field_I);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rt.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    RevivalEvent(Unit param0, int param1, int param2) {
        try {
          this.unit = param0;
          this.eventKind = 25;
          this.destinationY = param2;
          this.destinationX = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_B = "Elapsed time";
    }
}

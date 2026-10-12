/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DeployRequest extends ActionRequest {
    private int deployModifier;
    static String[] field_v;
    static String field_x;
    static um field_B;
    private int tileX;
    static String field_w;
    private int tileY;

    final static String a(String param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          if (param1 != 42) {
            field_w = (String) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var4 == 0) {
              var5 = hc.a(98, (char) var5);
            } else {
              var5 = Character.toLowerCase((char) var5);
            }
            var3[var4] = (char)var5;
          }
          stackIn_10_0 = new String(var3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("jc.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static b b(int param0, int param1) {
        b var2 = null;
        b var2Lifetime1;
        if (param0 == -1) {
          var2 = new b();
          ta.field_O.addLast((byte) -119, (IntrusiveNode) (var2));
          RegionAnchor.a(param1, (byte) -32);
          return var2;
        }
        field_w = (String) null;
        var2Lifetime1 = new b();
        ta.field_O.addLast((byte) -119, (IntrusiveNode) (var2Lifetime1));
        RegionAnchor.a(param1, (byte) -32);
        return var2Lifetime1;
    }

    private final String formatDeployRejection(String[] messageParts, boolean obfuscationGuard) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            stackIn_4_0 = this.formatIllegalMove(125, messageParts, "deploy");
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jc.F(");
          if (messageParts == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_x = null;
        field_B = null;
        int var1 = 117 % ((-27 - param0) / 51);
        field_v = null;
        field_w = null;
    }

    DeployRequest(int actingPlayer, int tileX, int tileY, int deployModifier) {
        this.actingPlayer = actingPlayer;
        this.tileX = tileX;
        this.deployModifier = deployModifier;
        this.tileY = tileY;
    }

    final PreparedAction prepareAction(int obfuscationGuard, Battlefield battlefield) {
        String discarded$11 = null;
        String discarded$10 = null;
        String discarded$9 = null;
        String discarded$8 = null;
        String discarded$6 = null;
        String discarded$7 = null;
        RuntimeException var3 = null;
        MapTile var4 = null;
        Unit var5 = null;
        Unit var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_19_0 = null;
        PreparedAction stackIn_22_0 = null;
        DeployAction stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.unlink(96);
          var5 = battlefield.getUnitAt(this.tileY, true, this.tileX);
          var6 = var5;
          if (var6 == null) {
            discarded$11 = this.formatDeployRejection(new String[]{"no unit at ", TutorialController.formatCoordinatePair(this.tileX, 0, this.tileY)}, false);
            stackIn_2_0 = null;
            return (PreparedAction) (stackIn_2_0);
          }
          if (this.actingPlayer != var6.ownerPlayer) {
            discarded$10 = this.formatDeployRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.tileX, 0, this.tileY), "not owned by player ", "" + this.actingPlayer}, false);
            stackIn_5_0 = null;
            return (PreparedAction) (stackIn_5_0);
          }
          if (var6.movementSpent) {
            discarded$9 = this.formatDeployRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.tileX, 0, this.tileY), " has moved"}, false);
            stackIn_8_0 = null;
            return (PreparedAction) (stackIn_8_0);
          }
          if (0 >= (bw.unitDefinitions[var5.unitType][10] & 1024)) {
            discarded$8 = this.formatDeployRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.tileX, 0, this.tileY), " cannot deploy"}, false);
            stackIn_11_0 = null;
            return (PreparedAction) (stackIn_11_0);
          }
          var4 = battlefield.tiles[var6.tileX + var6.tileY * battlefield.mapWidth];
          if (34 == var6.unitType &&
            !var4.f(19725)) {
            discarded$6 = this.formatDeployRejection(new String[]{"can't deploy on top of structure at ", TutorialController.formatCoordinatePair(this.tileX, 0, this.tileY)}, false);
            stackIn_15_0 = null;
            return (PreparedAction) (stackIn_15_0);
          }
          if (var6.unitType == 7 &&
            var4.terrainType != 0) {
            discarded$7 = this.formatDeployRejection(new String[]{"can't deploy on top of structure at ", TutorialController.formatCoordinatePair(this.tileX, 0, this.tileY)}, false);
            stackIn_19_0 = null;
            return (PreparedAction) (stackIn_19_0);
          }
          if (obfuscationGuard > 31) {
            stackIn_24_0 = new DeployAction(this.actingPlayer, var6, this.deployModifier);
            return (PreparedAction) ((Object) stackIn_24_0);
          }
          stackIn_22_0 = (PreparedAction) null;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("jc.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_w = "Send private Quick Chat to <%0>";
        field_x = "Warning! All your portals are blocked and you haven't moved a unit recently. You have <%0> turns until you fail the mission.";
    }
}

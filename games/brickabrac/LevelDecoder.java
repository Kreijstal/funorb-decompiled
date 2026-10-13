/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelDecoder {
    static String field_a;
    static String field_c;
    static int field_b;

    final static void a(PacketBuffer param0, PacketBuffer param1, java.math.BigInteger param2, byte param3, java.math.BigInteger param4) {
        try {
          tm.a(param0, param1.position, (byte) 126, param2, 0, param1.data, param4);
          if (param3 != -72) {
            LevelDecoder.a((byte) -97);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dq.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 89) {
          return;
        }
        field_a = null;
    }

    final static int decodeLevel(NodeDeque[] brickGroups, boolean obfuscationGuard, PacketBuffer packet, NodeDeque motionPaths, IntNode levelState, ga unusedContext) {
        int brickIndex = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int destinationGroupIndex = 0;
        RuntimeException var6 = null;
        int flags = 0;
        int var8 = 0;
        int entryIndex = 0;
        Brick movingBrick = null;
        int brickCount = 0;
        Brick brick = null;
        int var13 = 0;
        java.math.BigInteger var14 = null;
        Brick legacyBrick = null;
        BrickMotionPath motionPath = null;
        int version;
        int pathCount;
        int pathIndex;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          for (destinationGroupIndex = 0; brickGroups.length > destinationGroupIndex; destinationGroupIndex++) {
            if (!brickGroups[destinationGroupIndex].isEmpty(false)) {
              throw new IllegalArgumentException();
            }
          }
          if (!obfuscationGuard) {
            var14 = (java.math.BigInteger) null;
            LevelDecoder.a((PacketBuffer) null, (PacketBuffer) null, (java.math.BigInteger) null, (byte) 57, (java.math.BigInteger) null);
          }
          if (!motionPaths.isEmpty(false)) {
            throw new IllegalArgumentException();
          }
          version = packet.readInt(255);
          if (version > 5) {
            throw new IllegalArgumentException();
          }
          flags = packet.readInt(255);
          if (3 < version) {
            levelState.value = flags >>> 8;
            flags = flags & 255;
          } else {
            levelState.value = 0;
          }
          if (3 <= version) {
            stackIn_21_0 = ((1 & flags) != 0) ? 0 : 1;
            var8 = stackIn_21_0;
            stackIn_24_0 = (var8 != 0) ? 15 : 9;
            CacheIoRequest.addBoardBorders(stackIn_24_0, brickGroups[2], 16);
            for (entryIndex = 0; brickGroups.length > entryIndex; entryIndex++) {
              brickCount = packet.readInt(255);
              for (brickIndex = 0; brickCount > brickIndex; brickIndex++) {
                brick = new Brick();
                brick.readBodySnapshot(91, packet);
                brickGroups[entryIndex].addLast(brick, (byte) 3);
              }
            }
          } else {
            var8 = packet.readInt(255);
            for (entryIndex = 0; var8 > entryIndex; entryIndex++) {
              legacyBrick = new Brick();
              if (version != 0) {
                if (version > 0) {
                  legacyBrick.readBodySnapshot(101, packet);
                }
              } else {
                legacyBrick.x256 = packet.readInt(255);
                legacyBrick.y256 = packet.readInt(255);
                legacyBrick.velocityX256 = packet.readInt(255);
                legacyBrick.velocityY256 = packet.readInt(255);
                legacyBrick.typeId = packet.readInt(255);
                legacyBrick.flags = packet.readInt(255);
              }
              brickGroups[0].addLast(legacyBrick, (byte) 3);
            }
            movingBrick = (Brick) (brickGroups[0].first(-54));
            while (movingBrick != null) {
              if ((movingBrick.flags & 4) != 0) {
                brickGroups[1].addLast(movingBrick, (byte) 3);
              }
              movingBrick = (Brick) (brickGroups[0].next((byte) 116));
            }
          }
          if (version > 1) {
            pathCount = packet.readInt(255);
            for (pathIndex = 0; pathCount > pathIndex; pathIndex++) {
              motionPath = new BrickMotionPath();
              motionPath.readBodySnapshot(90, packet);
              motionPaths.addLast(motionPath, (byte) 3);
            }
          }
          if (version > 4) {
            packet.readLegacyUtf8String((byte) 24);
          }
          stackIn_55_0 = flags;
          return stackIn_55_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_58_0 = var6;
          stackIn_58_1 = new StringBuilder().append("dq.A(");
          if (brickGroups == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (motionPaths == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (levelState == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (unusedContext == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    static {
        field_c = "You are on <%0>";
        field_b = 0;
    }
}

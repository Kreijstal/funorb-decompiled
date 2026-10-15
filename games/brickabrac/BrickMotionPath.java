/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrickMotionPath extends MovingBody {
    static long lastGameWriteMillis;
    static RgbSprite[] field_r;
    private int waypointCount;
    NodeDeque waypoints;
    static String field_s;
    int durationTicks;

    public static void b(boolean param0) {
        field_r = null;
        if (!param0) {
          BrickMotionPath.b(true);
          field_s = null;
          return;
        }
        field_s = null;
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        int var3_int = 0;
        RuntimeException var3 = null;
        MotionWaypoint var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = -1437511254;
          var3_int = var3_int + (73 + this.waypointCount * 71 << 3);
          var3_int = var3_int ^ this.durationTicks * 21 + 29298 << 9;
          if (obfuscationGuard < 79) {
            this.waypointCount = 98;
          }
          var4 = (MotionWaypoint) (this.waypoints.first(-103));
          while (var4 != null) {
            var3_int = var3_int ^ var4.computeSyncChecksum(92, diagnostics);
            var4 = (MotionWaypoint) (this.waypoints.next((byte) 116));
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("cl.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    BrickMotionPath() {
        super(0, 0, 0, 0, 0);
        this.waypoints = new NodeDeque();
    }

    final void readBodySnapshot(int obfuscationGuard, PacketBuffer packet) {
        int var3_int = 0;
        MotionWaypoint var4 = null;
        int var5 = 0;
        PacketBuffer var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          this.waypointCount = packet.readUnsignedByte(255);
          this.waypoints.clear((byte) -72);
          this.durationTicks = 0;
          var3_int = 0;
          if (obfuscationGuard < 89) {
            var6 = (PacketBuffer) null;
            this.readBodySnapshot(-40, (PacketBuffer) null);
          }
          while (this.waypointCount > var3_int) {
            var4 = new MotionWaypoint();
            var4.readBodySnapshot(91, packet);
            this.waypoints.addLast(var4, (byte) 3);
            this.durationTicks = this.durationTicks + var4.durationTicks;
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("cl.L(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_s = "The invitation has been withdrawn.";
    }
}

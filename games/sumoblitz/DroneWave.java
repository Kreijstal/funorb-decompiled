/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DroneWave {
    int field_a;
    Drone[] drones;

    final int countDrones(int initialCount) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = initialCount;
        for (var3 = 0; var3 < this.drones.length; var3++) {
          if (this.drones[var3] != null) {
            var2++;
          }
        }
        return var2;
    }

    final static boolean tryLoadArchive(ResourceArchive archive, int guard) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= 25) {
            stackIn_4_0 = archive.tryLoadAllGroups(true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("wc.B(");
          if (archive == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    DroneWave(Drone[] roster, int metadata, boolean flag) {
        try {
          this.field_a = metadata;
          this.drones = roster;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wc.<init>(" + (roster != null ? "{...}" : "null") + ',' + metadata + ',' + flag + ')');
        }
    }

    static {
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GraphicsHeap extends IntrusiveNode {
    static int field_d;
    private static String field_z;

    protected GraphicsHeap() {
    }

    final static int c(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          if (null == ArchiveIndexLoader.field_g) {
            if (param0 != -93) {
              GraphicsHeap.c((byte) 43);
            }
            stackIn_15_0 = 12;
            return stackIn_15_0;
          }
          var1_int = 0;
          for (var2 = 0; var2 < 12; var2++) {
            var3 = ArchiveIndexLoader.field_g.componentoptionStates[var2];
            if (ArchiveIndexLoader.field_g.isOptionStateAvailable(var3, true, false) ||
              ArchiveIndexLoader.field_g.isComingSoonOptionState(var3, -40)) {
              var1_int++;
            }
          }
          stackIn_11_0 = var1_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var1), field_z + param0 + ')');
        }
    }

    static {
        field_z = "za.C(";
    }
}

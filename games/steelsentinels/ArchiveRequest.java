/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualNode {
    static int[] field_D;
    static int field_y;
    volatile boolean field_z;
    static String[] field_A;
    static boolean field_E;
    boolean field_B;
    static int field_F;
    boolean field_C;

    public static void releaseStatics(byte param0) {
        if (param0 < 11) {
          return;
        }
        field_D = null;
        field_A = null;
    }

    final static void pushClip(int param0, int param1, int param2, int param3, int param4) {
        ArchiveIndex.pushRasterState(false);
        int var5 = 80 % ((param2 + 37) / 40);
        SoftwareRaster.intersectClip(param0, param1, param3, param4);
    }

    abstract int getProgress(int param0);

    abstract byte[] getData(byte param0);

    final static void tickLobbyHighlights(byte param0) {
        RuntimeException decompiledCaughtException = null;
        LobbyPlayer var1 = null;
        LobbyGame var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        LobbyPlayer var1Lifetime1;
        var2 = SteelSentinels.obfuscationControl;
        try {
          var1 = (LobbyPlayer) (IterableNodeHashTable.field_m.first(13058));
          while (var1 != null) {
            if (var1.field_Ub > 0) {
              var1.field_Ub = var1.field_Ub - 1;
              if (var1.field_Ub == 0) {
                var1.field_Wb = 0;
                if (var1.isUnlisted((byte) -36)) {
                  var1.unlink(4);
                }
              }
            }
            var1 = (LobbyPlayer) (IterableNodeHashTable.field_m.next((byte) -36));
          }
          if (param0 <= 102) {
            ArchiveRequest.releaseStatics((byte) 19);
          }
          var1_ref = (LobbyGame) (ClientErrorSupport.field_e.first(13058));
          while (var1_ref != null) {
            if (var1_ref.field_mc > 0) {
              var1_ref.field_mc = var1_ref.field_mc - 1;
              if (var1_ref.field_mc == 0) {
                var1_ref.field_Ac = 0;
                if (var1_ref.isUnlisted(4219)) {
                  var1_ref.unlink(4);
                }
              }
            }
            var1_ref = (LobbyGame) (ClientErrorSupport.field_e.next((byte) -33));
          }
          var1Lifetime1 = (LobbyPlayer) (SocialStateHelpers.field_d.first(13058));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_Ub > 0) {
              var1Lifetime1.field_Ub = var1Lifetime1.field_Ub - 1;
              if (var1Lifetime1.field_Ub != 0) {
                var1Lifetime1 = (LobbyPlayer) (SocialStateHelpers.field_d.next((byte) -34));
                continue;
              }
              var1Lifetime1.field_Wb = 0;
              if (var1Lifetime1.isUnlisted((byte) -36)) {
                var1Lifetime1.unlink(4);
              }
            }
            var1Lifetime1 = (LobbyPlayer) (SocialStateHelpers.field_d.next((byte) -34));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var1_ref2), "fe.J(" + param0 + ')');
        }
    }

    ArchiveRequest() {
        this.field_z = true;
    }

    static {
        field_D = new int[2];
        field_y = 65;
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}

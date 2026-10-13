/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelPackLoader {
    static String field_h;
    static String field_a;
    static String field_c;
    static String field_i;
    static String field_d;
    static IndexedSprite[] field_b;
    static int field_g;
    static PlatformServices field_e;
    static RgbSprite field_f;

    public static void b(int param0) {
        field_i = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_h = null;
        field_a = null;
        if (param0 == -30593) {
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 != 4252) {
          return;
        }
        ng.field_b = 0;
        di.a((byte) -114);
    }

    final static LevelPack loadLevelPack(byte obfuscationGuard, ResourceArchive archive, PacketBuffer packet, int archiveSelector, int packId, int completionWord, int scoreOffset) {
        int dupTemp$1 = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        LevelMetadata var10 = null;
        int var11 = 0;
        LevelPack var12 = null;
        LevelPack var13 = null;
        LevelPack stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9Lifetime1;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          var12 = new LevelPack(packId, scoreOffset, completionWord);
          var13 = var12;
          dupTemp$1 = packet.readUnsignedShort(65280);
          var13.levelCount = dupTemp$1;
          var8 = dupTemp$1;
          var13.levelData = new byte[var8][];
          var13.metadata = new LevelMetadata[var8];
          for (var9 = 0; var8 > var9; var9++) {
            var10 = ai.readLevelMetadata((byte) -12, packet);
            var12.metadata[var10.levelId] = var10;
            var13.levelData[var10.levelId] = archive.takeFile(var10.resourceIndex, archiveSelector, 4);
          }
          var9Lifetime1 = -74 % ((7 - obfuscationGuard) / 52);
          stackIn_5_0 = var13;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("mq.C(").append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (packet == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(archiveSelector).append(',').append(packId).append(',').append(completionWord).append(',').append(scoreOffset).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        int var1 = 25 % ((param0 - 55) / 54);
        return uo.a(uc.e((byte) -95), (byte) 14);
    }

    final static mh c(int param0) {
        if (param0 != 0) {
          return (mh) null;
        }
        return IsaacGenerator.field_b.field_Rb;
    }

    final static al a(byte param0, int param1) {
        al var2 = null;
        al var2Lifetime1;
        if (param0 > 37) {
          var2 = new al();
          ej.field_F.addLast(var2, (byte) 3);
          ma.b((byte) -112, param1);
          return var2;
        }
        LevelPackLoader.a((byte) -67, -39);
        var2Lifetime1 = new al();
        ej.field_F.addLast(var2Lifetime1, (byte) 3);
        ma.b((byte) -112, param1);
        return var2Lifetime1;
    }

    static {
        field_h = "(<%0> players want to join)";
        field_a = "Please log in to access this feature.";
        field_i = "Tutorial";
        field_c = "Orb points: ";
        field_d = "End Game";
    }
}

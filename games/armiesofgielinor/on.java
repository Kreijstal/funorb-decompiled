/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class on extends IntrusiveNode {
    static String field_p;
    int[] field_m;
    static String field_k;
    int field_l;
    static String field_o;
    static int field_n;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_k = null;
        if (param0 != -7) {
          on.a(-36);
        }
    }

    final static void scatterMapTerrain(Battlefield battlefield, int preferredTerrainType, boolean obfuscationGuard, Random random) {
        int attempt = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int tileX = 0;
        int tileY = 0;
        int tileIndex = 0;
        int terrainRoll = 0;
        int obfuscationControl = 0;
        int neighborTerrainRoll;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (attempt = 0; attempt < battlefield.mapHeight * battlefield.mapWidth / 3; attempt++) {
            boolean decompiledFrameRemainder0 = true;
            tileX = 1 + AttackEvent.nextBoundedInt(false, battlefield.mapWidth - 2, random);
            tileY = AttackEvent.nextBoundedInt(obfuscationGuard, battlefield.mapHeight - 2, random) + 1;
            tileIndex = tileY * battlefield.mapWidth + tileX;
            if (battlefield.tiles[tileIndex].terrainType == 0 &&
              null == battlefield.tiles[tileIndex].occupant) {
              if (battlefield.tiles[1 + tileIndex].terrainType != preferredTerrainType &&
                preferredTerrainType != battlefield.tiles[-1 + tileIndex].terrainType &&
                battlefield.tiles[battlefield.mapWidth + tileIndex].terrainType != preferredTerrainType &&
                preferredTerrainType != battlefield.tiles[tileIndex - battlefield.mapWidth].terrainType) {
                terrainRoll = AttackEvent.nextBoundedInt(false, 100, random);
                if (terrainRoll < 20) {
                  battlefield.tiles[tileIndex].terrainType = 3;
                } else {
                  if (40 > terrainRoll) {
                    battlefield.tiles[tileIndex].terrainType = 5;
                  } else {
                    if (50 > terrainRoll) {
                      battlefield.tiles[tileIndex].terrainType = 2;
                    } else {
                      if ((!(70 <= terrainRoll)) &&
                        (!(preferredTerrainType <= -1))) {
                        battlefield.tiles[tileIndex].terrainType = preferredTerrainType;
                      }
                    }
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (AttackEvent.nextBoundedInt(false, 100, random) >= 40) {
                  neighborTerrainRoll = AttackEvent.nextBoundedInt(obfuscationGuard, 100, random);
                  if (neighborTerrainRoll >= 20) {
                    if (neighborTerrainRoll < 40) {
                      battlefield.tiles[tileIndex].terrainType = 5;
                    } else {
                      if (neighborTerrainRoll >= 50) {
                        if (neighborTerrainRoll < 70 &&
                          preferredTerrainType > -1) {
                          battlefield.tiles[tileIndex].terrainType = preferredTerrainType;
                        }
                      } else {
                        battlefield.tiles[tileIndex].terrainType = 2;
                      }
                    }
                  } else {
                    battlefield.tiles[tileIndex].terrainType = 3;
                  }
                } else {
                  battlefield.tiles[tileIndex].terrainType = preferredTerrainType;
                }
              }
            }
          }
          if (obfuscationGuard) {
            field_o = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_36_0 = var4;
          stackIn_36_1 = new StringBuilder().append("on.A(");
          if (battlefield == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(preferredTerrainType).append(',').append(obfuscationGuard).append(',');
          if (random == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    private on() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "Melee";
        field_p = "Village";
        field_o = "Slow";
    }
}

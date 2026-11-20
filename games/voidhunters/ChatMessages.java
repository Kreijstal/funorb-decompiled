/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessages {
    static String wonMatchText;
    static String spawnSpawnpointText;

    final static void appendMessage(byte param0, int param1, String param2, String param3, String param4, int param5) {
        ChatMessage var6 = null;
        try {
          if (param0 >= -12) {
            wonMatchText = (String) null;
          }
          var6 = new ChatMessage(param5, param3, param1, param2, param4);
          MassDriverWeaponDefinition.appendChatMessage(var6, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "lh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        wonMatchText = null;
        spawnSpawnpointText = null;
        if (param0 != 15261) {
          spawnSpawnpointText = (String) null;
        }
    }

    static {
        spawnSpawnpointText = "Spawn Spawnpoint";
        wonMatchText = "<%0> won the match!";
    }
}

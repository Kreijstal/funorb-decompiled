/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCommandRegistry {
    private static String field_z;

    final static QuickChatCommand quickChatCommand(int guard, int id) {
        int var3 = 0;
        QuickChatCommand[] var2;
        int var4;
        QuickChatCommand[] var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var5 = IndexedSprite.quickChatCommands(96);
        var2 = var5;
        if (guard != 10341) {
          return (QuickChatCommand) null;
        }
        for (var3 = 0; var5.length > var3; var3++) {
          if (id == var5[var3].id) {
            return var5[var3];
          }
        }
        return null;
    }

    static {
        field_z = "ij.A(";
    }
}

/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String currentLoginIdentifier;
    static ArchiveLoadSequence field_b;

    final static void a(boolean param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        TextTemplateDefinition.a(2274, (String) null, param1, param0);
        if (param2) {
            b.a(true, false, true);
        }
    }

    public static void a(int param0) {
        if (param0 != 17062) {
            return;
        }
        currentLoginIdentifier = null;
        field_b = null;
    }

    final static TextTemplateArgumentType findTextTemplateArgumentType(boolean methodGuard, int typeId) {
        TextTemplateArgumentType[] var2;
        int var3;
        int var4;
        var4 = Geoblox.clientControlFlowFlag;
        var2 = GzipInflater.textTemplateArgumentTypes(-1);
        var3 = 0;
        if (methodGuard) {
          b.a(-38);
        }
        while (var3 < var2.length) {
          if (typeId == var2[var3].typeId) {
            return var2[var3];
          }
          var3++;
        }
        return null;
    }

    static {
    }
}

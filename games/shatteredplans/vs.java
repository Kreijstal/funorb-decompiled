/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static String field_b;
    static int field_d;
    static String field_f;
    static String field_c;
    static String field_e;
    static String field_a;

    final static gb a(byte param0, int param1) {
        gb var2 = new gb();
        SolMapGenerator.field_o.addLast((byte) -113, var2);
        AccountNoticeDialog.a(param1, 2);
        if (param0 == 88) {
          return var2;
        }
        return (gb) null;
    }

    public static void clearStatics(int param0) {
        field_c = null;
        field_e = null;
        field_f = null;
        field_b = null;
        int var1 = 30 / ((param0 - 61) / 33);
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        lq var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = (lq) (rs.field_Bb.startForward(0));
          while (var4 != null) {
            wj.a(320, param0, var4);
            var4 = (lq) (rs.field_Bb.nextForward((byte) -71));
          }
          if (param1 > -18) {
            field_b = (String) null;
          }
          var2 = SolMapGenerator.field_o.startForward(0);
          while (var2 != null) {
            AccountNoticeDialog.a(param0, 2);
            var2 = SolMapGenerator.field_o.nextForward((byte) -71);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var2_ref), "vs.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_e = "The invitation has been withdrawn.";
        field_c = "Most fleets constructed in one turn.";
        field_b = "Resources used to construct vs total resources collected (average for game).";
        field_a = "1 point per turn";
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}

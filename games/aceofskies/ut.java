/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ut {
    static int field_a;
    static RenderSprite lockedSprite;
    static String field_b;

    public static void a(byte param0) {
        if (param0 <= 104) {
          lockedSprite = (RenderSprite) null;
          field_b = null;
          lockedSprite = null;
          return;
        }
        field_b = null;
        lockedSprite = null;
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param1 != -96) {
          return;
        }
        param0--;
        while (param0 >= 0) {
          try {
            var9 = param2;
            var5 = var9;
            var6 = param4;
            var7 = param3;
            var9[var6] = var7 + (pg.a(var9[var6], 16711422) >> 1);
            param4++;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = var5_ref;
            stackIn_10_1 = new StringBuilder().append("ut.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
          param0--;
        }
    }

    static {
        field_b = "This game has been updated! Please reload this page.";
    }
}
